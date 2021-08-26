# jpaRepository

This project is a simple repro for quarkus issue [19683](https://github.com/quarkusio/quarkus/issues/19683).

To reproduce the issue, verify first that running quarkus:dev and issuing a GET to `http://localhost:8095/doStuff` returns a 200 OK response with text `done`.

Then build a native image (see below), run it and perform the same REST request. It should fail.

## Building a native image

The following are prerequisites:

- The kubernetes `quarkus.container-image` properties in `src\main\resources\application.yml` will need to be adjusted to target an available docker repository.
- A postgres database `jparepo` will be need to be created that can be targeted by the native image at runtime. Set the properties in `src\main\resources\kubernetes.yml` accordingly.


