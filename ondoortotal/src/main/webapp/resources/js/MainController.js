app = angular.module("myapp", []);
app.controller("MainController", function($scope, $http) {
	
  $scope.menus = [
  {
    title: "Menu1", 
    action: "#", 
    menus: [
      {
        title: "Item Creation",
        action: fetchMenus()//"welcome"
      },
      {
        title: "Inwarding",
        action: "moreStuff",
        menus: [
          {
            title: "Submenu 1b 1",
            action: "stuff"
          },
          {
            title: "Submenu 1b 2",
            action: "moreStuff"
          }
        ]
      }
    ]
  },
  {
    title: "Menu2", 
    action: "#", 
    menus: [
      {
        title: "Submenu 2a",
        action: "awesomeStuff"
      },
      {
        title: "Submenu 2b",
        action: "moreAwesomeStuff"
      }
    ]
  }
]
  
  function fetchMenus(){
	  console.log('Menus*********');
      $http.post("http://localhost:8080/auth/")
          .then(
          function (response) {
//              deferred.resolve(response.data);
//              console.log("response",response);
          },
          function(errResponse){
              console.error('Error while creating User');
//              deferred.reject(errResponse);
          }
      );
//      return deferred.promise;
  
  }

});

$(document).ready(function() {});