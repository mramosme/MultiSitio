'use strict';

var controllers = angular.module("controllers", []);

controllers.controller("HomeController", ['$scope', '$http', function ($scope, $http) {
   $scope.debug = true;
   $scope.title = 'MULTISITIO PRUEBA ';

   $http.get("json/metallica/get").success(function (data) {
      $scope.data = data;
     
   });

   $scope.toggleDebug = function () {
       $scope.debug = !$scope.debug;
   };
}]);