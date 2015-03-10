// @SOURCE:/home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/conf/routes
// @HASH:10e4af0bd031eaa6e79d2d59a7ae7abbd8e95080
// @DATE:Tue Mar 10 15:37:59 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def simulationProcess(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "simulation")
}
                        

// @LINE:10
def viewIndividualCow(cowIdentifier:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "viewCowDetails/individualCow" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("cowIdentifier", cowIdentifier)))))
}
                        

// @LINE:8
def viewCowDetails(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "viewCowDetails")
}
                        

// @LINE:7
def dashboard(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                        

// @LINE:11
def secondGraph(cowIdentifier:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "viewCowDetails/secondGraph" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("cowIdentifier", cowIdentifier)))))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:13
def javascriptRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def simulationProcess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.simulationProcess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simulation"})
      }
   """
)
                        

// @LINE:10
def viewIndividualCow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.viewIndividualCow",
   """
      function(cowIdentifier) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewCowDetails/individualCow" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("cowIdentifier", cowIdentifier)])})
      }
   """
)
                        

// @LINE:8
def viewCowDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.viewCowDetails",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewCowDetails"})
      }
   """
)
                        

// @LINE:7
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

// @LINE:11
def secondGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.secondGraph",
   """
      function(cowIdentifier) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewCowDetails/secondGraph" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("cowIdentifier", cowIdentifier)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:13
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def simulationProcess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.simulationProcess(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "simulationProcess", Seq(), "GET", """""", _prefix + """simulation""")
)
                      

// @LINE:10
def viewIndividualCow(cowIdentifier:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.viewIndividualCow(cowIdentifier), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "viewIndividualCow", Seq(classOf[String]), "GET", """""", _prefix + """viewCowDetails/individualCow""")
)
                      

// @LINE:8
def viewCowDetails(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.viewCowDetails(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "viewCowDetails", Seq(), "GET", """""", _prefix + """viewCowDetails""")
)
                      

// @LINE:7
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dashboard(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

// @LINE:11
def secondGraph(cowIdentifier:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.secondGraph(cowIdentifier), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "secondGraph", Seq(classOf[String]), "GET", """""", _prefix + """viewCowDetails/secondGraph""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:13
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

}
                          
}
        
    