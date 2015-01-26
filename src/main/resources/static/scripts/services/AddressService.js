/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/22/15
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
(function(){
    var address = function($http) {
        var getAddresses = function() {
            return $http.get("../main")
                .then(function(response) {
                    return response.data;
                });
        };

        var saveAddress = function(addressObj) {
            $http.post("../save", addressObj)
                .then(function() {
                    console.log("Saved Address Successfully!")
                });
        };

        return {
            getAddresses: getAddresses,
            saveAddress: saveAddress
        };
    };

    var module = angular.module("addressBook");
    module.factory("address", address);
}());