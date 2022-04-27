require_relative "application_controller"

class DerivedController < ApplicationController

    before_filter :login_required

    def do_it
        puts "hello"
    end

end
