// @SOURCE:/home/ramyaky/Ramya/play-2.2.4/CMPE282Project-master/conf/routes
// @HASH:10e4af0bd031eaa6e79d2d59a7ae7abbd8e95080
// @DATE:Tue Mar 10 15:37:59 PDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_dashboard1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
private[this] lazy val controllers_Application_dashboard1_invoker = createInvoker(
controllers.Application.dashboard(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Nil,"GET", """""", Routes.prefix + """dashboard"""))
        

// @LINE:8
private[this] lazy val controllers_Application_viewCowDetails2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewCowDetails"))))
private[this] lazy val controllers_Application_viewCowDetails2_invoker = createInvoker(
controllers.Application.viewCowDetails(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "viewCowDetails", Nil,"GET", """""", Routes.prefix + """viewCowDetails"""))
        

// @LINE:9
private[this] lazy val controllers_Application_simulationProcess3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("simulation"))))
private[this] lazy val controllers_Application_simulationProcess3_invoker = createInvoker(
controllers.Application.simulationProcess(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "simulationProcess", Nil,"GET", """""", Routes.prefix + """simulation"""))
        

// @LINE:10
private[this] lazy val controllers_Application_viewIndividualCow4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewCowDetails/individualCow"))))
private[this] lazy val controllers_Application_viewIndividualCow4_invoker = createInvoker(
controllers.Application.viewIndividualCow(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "viewIndividualCow", Seq(classOf[String]),"GET", """""", Routes.prefix + """viewCowDetails/individualCow"""))
        

// @LINE:11
private[this] lazy val controllers_Application_secondGraph5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewCowDetails/secondGraph"))))
private[this] lazy val controllers_Application_secondGraph5_invoker = createInvoker(
controllers.Application.secondGraph(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "secondGraph", Seq(classOf[String]),"GET", """""", Routes.prefix + """viewCowDetails/secondGraph"""))
        

// @LINE:13
private[this] lazy val controllers_Application_javascriptRoutes6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
private[this] lazy val controllers_Application_javascriptRoutes6_invoker = createInvoker(
controllers.Application.javascriptRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Application.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewCowDetails""","""controllers.Application.viewCowDetails()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""","""controllers.Application.simulationProcess()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewCowDetails/individualCow""","""controllers.Application.viewIndividualCow(cowIdentifier:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewCowDetails/secondGraph""","""controllers.Application.secondGraph(cowIdentifier:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_dashboard1_route(params) => {
   call { 
        controllers_Application_dashboard1_invoker.call(controllers.Application.dashboard())
   }
}
        

// @LINE:8
case controllers_Application_viewCowDetails2_route(params) => {
   call { 
        controllers_Application_viewCowDetails2_invoker.call(controllers.Application.viewCowDetails())
   }
}
        

// @LINE:9
case controllers_Application_simulationProcess3_route(params) => {
   call { 
        controllers_Application_simulationProcess3_invoker.call(controllers.Application.simulationProcess())
   }
}
        

// @LINE:10
case controllers_Application_viewIndividualCow4_route(params) => {
   call(params.fromQuery[String]("cowIdentifier", None)) { (cowIdentifier) =>
        controllers_Application_viewIndividualCow4_invoker.call(controllers.Application.viewIndividualCow(cowIdentifier))
   }
}
        

// @LINE:11
case controllers_Application_secondGraph5_route(params) => {
   call(params.fromQuery[String]("cowIdentifier", None)) { (cowIdentifier) =>
        controllers_Application_secondGraph5_invoker.call(controllers.Application.secondGraph(cowIdentifier))
   }
}
        

// @LINE:13
case controllers_Application_javascriptRoutes6_route(params) => {
   call { 
        controllers_Application_javascriptRoutes6_invoker.call(controllers.Application.javascriptRoutes())
   }
}
        

// @LINE:16
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     