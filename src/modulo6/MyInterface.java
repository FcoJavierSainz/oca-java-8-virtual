package modulo6;

interface BaseInterface1 {

  String getName(); // change to default
}

interface BaseInterface2 {

  String getName(); // change to default
}

interface MyInterface extends BaseInterface1, BaseInterface2 {

}