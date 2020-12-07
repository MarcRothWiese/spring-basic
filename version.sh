#!/bin/bash
strVersion=`grep 'version=' target/maven-archiver/pom.properties`
echo "${strVersion/version=/}"
