'use strict';

var controllers = angular.module("controllers", []);

controllers.controller("HomeController", ['$scope', '$http', function ($scope, $http) {
   
   $http.get("json/negocio/1").success(function (data) {
      $scope.data = data;
     return $scope.data
   });
   
   $http.get("json/sitio/1").success(function (dataSitio) {
	      $scope.dataS = dataSitio;
	     return $scope.dataS
	   });

}]);