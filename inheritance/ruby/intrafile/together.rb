class ActiveController
  def foo()
    print "Foo\n"
  end
end

#MATCH:
class DerivedController < ActiveController
  def foo()
    print "DerivedFoo\n"
  end
end

#MATCH:
class MyController1 < ActiveController
end

#DEEP:
class MyController2 < DerivedController
end

def main()
  obj1 = MyController1.new()
  obj1.foo
  obj2 = MyController2.new()
  obj2.foo
end

main()
