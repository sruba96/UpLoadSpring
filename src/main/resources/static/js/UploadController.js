/**
 * Created by pawel on 08.04.16.
 */

var example = angular.module('UpLoad', []);


example.controller('UpLoadController', function ($scope, $http) // serwis $http umożliwia zapytania ajax
{
    var self = this;

    this.file = {};

    this.addFile = function () {


        var ajax = $http.post('uploadfile', this.file);
        this.user = {};

        ajax.success(function (data) {
            if (data.result) {
                //$scope.registerForm = true;
            }
        });
    };


    example.directive('fileModel', ['$parse', function ($parse) {
    return {
        restrict: 'A',
        link: function(scope, element, attrs) {
            var model = $parse(attrs.fileModel);
            var modelSetter = model.assign;

            element.bind('change', function(){
                scope.$apply(function(){
                    modelSetter(scope, element[0].files[0]);
                });
            });
        }
    };
}]);


});