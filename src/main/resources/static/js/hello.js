'use strict';
angular.module('moncv')
        .controller('home', function ($http) {
            var self = this;
            $http.get('/resource/').then(function (response) {
                self.greetings = response.data;
            });
        });

