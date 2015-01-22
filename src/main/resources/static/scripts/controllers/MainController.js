/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/22/15
 * Time: 10:01 AM
 * To change this template use File | Settings | File Templates.
 */
(function(){
    var app = angular.module("addressBook");

    var mainController = function($scope, $http) {

        var setInfo = function(response) {
            $scope.people = response.data;
            console.log("During http get service.");
        };

        var error = function(data) {
            $scope.error = data;
        };

        $http.get("../main")
            .then(setInfo, error);

    };

    app.controller('MainController', mainController);
}());