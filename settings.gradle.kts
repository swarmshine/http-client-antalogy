rootProject.name = "http-client-anthology"

Projs.values().forEach {
    include(it.directory)
}