#!/bin/bash

echo "- Cleaning up before start the build process..."
./gradlew req:clean
./gradlew reqcore:clean
./gradlew reqfileserver:clean
./gradlew reqhttp:clean
./gradlew reqrx:clean
./gradlew reqmigrate:clean

echo "- Building req..."
./gradlew req:assembleRelease

echo "- Building reqcore..."
./gradlew reqcore:assembleRelease

echo "- Building reqfileserver..."
./gradlew reqfileserver:assembleRelease

echo "- Building reqhttp..."
./gradlew reqhttp:assembleRelease

echo "- Building reqrx..."
./gradlew reqrx:assembleRelease

echo "- Building reqmigrate..."
./gradlew reqmigrate:assembleRelease

echo "- Publishing to maven..."
./gradlew req:publish
./gradlew reqcore:publish
./gradlew reqfileserver:publish
./gradlew reqhttp:publish
./gradlew reqrx:publish
./gradlew reqmigrate:publish

echo "Finished!"
