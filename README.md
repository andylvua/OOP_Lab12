# Lab 12. Chain of Responsibility & Decorator
[![Java CI with Maven](https://github.com/andylvua/OOP_Lab12/actions/workflows/maven.yml/badge.svg)](https://github.com/andylvua/OOP_Lab12/actions/workflows/maven.yml)

## Description
A simple example of the Chain of Responsibility and Decorator patterns.

## Task
- [x] Complete Task 1.
- [x] Check OCR with Cloud Vision API.
- [x] Setup Google Cloud Project.
- [x] Install Google Storage and Cloud Vision libraries.
- [x] Complete Task 2.
- [x] Submit a link to GitHub with tests and a GitHub Action file.

## Setup

### Google Cloud Project
In order to run this project, you need to create a Google Cloud Project and enable the [Cloud Vision API](https://cloud.google.com/vision/docs/setup)

Instructions for creating a Google Cloud Project can be found [here](https://cloud.google.com/resource-manager/docs/creating-managing-projects)

After creating a project, you need to create a service account and [set up the credentials](https://cloud.google.com/docs/authentication/getting-started),
or you can use the [Google Cloud SDK](https://cloud.google.com/sdk/docs/install-sdk) to set up the credentials.

If you use the Google Cloud SDK, you can set up the credentials with the following commands:

```bash
gcloud init
gcloud auth application-default login
```

### Google Storage and local database

You will need to create a Google Storage bucket to store the images. Instructions for creating a bucket can be found [here](https://cloud.google.com/storage/docs/creating-buckets)

Along with the Google Storage bucket, you will need to create a local database to store the results of the OCR. You can use the [SQLite](https://www.sqlite.org/index.html) database.

If you are using IntelliJ, go to side panel and click on the `Database` tab. Click on the `+` button and select `SQLite` from the list. Enter `cache.db` as the database name and click `OK`.

## License

The [MIT](https://choosealicense.com/licenses/mit/) License (MIT)

Copyright © 2022. Andrii Yaroshevych
