/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/21/15
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
var app = angular.module("addressBook", ["ngRoute"]);

app.config(function($routeProvider){
   $routeProvider
       .when("/index", {
            templateUrl: "../views/address.html",
            controller: "AddressController"
       })
       .otherwise({redirectTo: "/index"});
});