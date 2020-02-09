#!/bin/bash
openapi-generator generate \
    -i accounting.yaml \
    -g kotlin-spring \
    -o ../../../build/generated \
    --additional-properties=library=spring-boot,beanValidations=true,serviceInterface=true,packageName=accounting \
    --import-mappings=DateTime=java.time.LocalDateTime \
    --type-mappings=DateTime=java.time.LocalDateTime