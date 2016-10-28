var app = angular.module('busquedaApp', []);
app.controller('busquedaCtrl', ['$scope','$http', function($scope,$http) {
	$scope.busqueda = function(actividad) {  
		
		
	$scope.act = document.getElementById("actividad").value;
	
	if($scope.act == ""){
		 $scope.des = document.getElementById("destino").value;
		 $http.get("json/sitio/" + $scope.des).success(function (dataSitio) {
	         $scope.dataSitio = dataSitio;
	        return $scope.dataSitio
	      });
	}else {
		$http.get("json/busqueda/" + $scope.act).success(function (data) {
	         $scope.data = data;
	        return $scope.data
	        console.log($scope.act);
	      });
	}
	
	 
	
	}
}]);