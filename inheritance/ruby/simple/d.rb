require_relative "a"

#MATCH:
class DerivedController < ActiveController
  def foo()
    print "DerivedFoo\n"
  end
end
