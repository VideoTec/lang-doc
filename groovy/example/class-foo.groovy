class Foo {
  static void main(args) {
    def hash = [name:"Andy", "VPN-#":45]
	assert hash.get("name") == "2Andy"
    println("hello world")
  }
}