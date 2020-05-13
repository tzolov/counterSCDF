# counterSCDF

#payload



[
 {
  "content": "test",
  "id": "1",
  "metaData": {
    "Language": "en"
    
  }
},
 {
  "content": "test",
  "id": "2",
  "metaData": {
    "Language": "de"
  }
}
]

curl -i -X POST -H "Content-Type: application/json" -d '[ {"content": "test", "id": "1", "metaData": { "Language": "en"} }, { "content": "test", "id": "2", "metaData": { "Language": "de" } } ]' localhost:20100

:str1.http > counter --counter.name=lang --counter.tag.expression.lang="#jsonPath(payload,'$.[*].metaData.Language')"
# defination


stream create Docs --definition "http | log"

stream create TestCounter  --definition ":Docs.http > Custom_counter --counter.name=lang --counter.tag.expression.lang=#jsonPath(payload,'$.[*].metaData.Language')" --deploy


stream create TestCounter  --definition ":str1.http > counter --counter.name=lang --counter.tag.expression.lang=#jsonPath(payload,'$.[*].metaData.Language')" --deploy

