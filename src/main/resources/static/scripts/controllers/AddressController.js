/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/22/15
 * Time: 10:01 AM
 * To change this template use File | Settings | File Templates.
 */
(function(){
    var app = angular.module("addressBook");

    var addressController = function($scope, $http, address) {

        var setInfo = function(data) {
            $scope.addresses = data;
        };

        var error = function(response) {
            $scope.error = "Something went wrong!";
        };

        address.getAddresses().then(setInfo, error);

        $scope.saveAddress = function(name, street, city, state, zip, phone) {
            var addressObj = {
                name: name,
                street: street,
                city: city,
                state: state,
                zip: zip,
                phone: phone
            }

            address.saveAddress(addressObj);

        };

    };

    app.controller('AddressController', addressController);
}());