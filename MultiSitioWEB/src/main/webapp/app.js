var app = angular.module('busquedaApp', []);
app.controller('busquedaCtrl', ['$scope', function($scope) {
        $scope.actividad ={
            act : "nadar"
        };
        
        $scope.lista_actividad = [];

        $scope.busqueda = function(actividad) {
            $scope.lista_actividad.push(actividad);
            $scope.actividad = {};
            document.getElementById("actividad").focus();
            console.log($scope.lista_actividad);
        }
}]);