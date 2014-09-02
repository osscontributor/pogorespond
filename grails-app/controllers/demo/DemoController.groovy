package demo

class DemoController {

    static responseFormats = ['json']

    def index() {
        def m = new Model(name: 'Some Name', description: 'Some Description')
        respond m
    }
}

class Model {
    String name
    String description
}
