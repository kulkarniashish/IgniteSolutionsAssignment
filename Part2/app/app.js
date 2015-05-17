var app = angular.module('feedApp', []);

app.controller("FeedCtrl", function ($scope, FeedService, $location) {


    //debugger;

    $scope.loadFeed = function (url) {

        FeedService.parseFeed($scope.feedSrc).then(function (response) {

            if(response.data.responseData)
                $scope.feeds = response.data.responseData.feed.entries;
        });
    };

/*    var url = $location.search().url;
    if(!_.isUndefined(url)){
         $scope.feedSrc = url;
         $scope.loadFeed();
    }*/


});


app.factory('FeedService', function ($http) {
    return {
        parseFeed: function (url) {

            var obj = $http.jsonp('//ajax.googleapis.com/ajax/services/feed/load?v=1.0&num=50&callback=JSON_CALLBACK&q=' + encodeURIComponent(url));
            return obj;
        }
    }
});