'use strict';

angular
        .module('moncv', [
    'ngRoute'
        ])
        .config(function ($routeProvider, $httpProvider,$locationProvider) {
            $routeProvider.when('/', {
                templateUrl: 'home.html',
                controller: 'home',
                controllerAs: 'controller'
            }).when('/login', {
                templateUrl: 'login.html',
                controller: 'navigation',
                controllerAs: 'controller'
            }).otherwise('/');
            $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
            
        });


