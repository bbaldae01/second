$(document).ready(function(){
	
	var EmpModel = Backbone.Model.extend({
		initialize: function(){
			console.log("EmpModel initialize()");
		}
	});
	
	var EmpCollection = Backbone.Collection.extend({
		model: EmpModel,
		url: '/employee/selectEmployeeList',
		initialize: function(){
			console.log("EmpCollection initialize()");
		},
		refreshData: function(param){
			console.log("EmpCollection refreshData()");
			var p = param || {};
			$.ajax({
				url: this.url,
				async: false,
				data: JSON.stringify(p),
				type:        'POST',
				dataType:    'json',
				contentType: 'application/json',
				cache:       false,
				success:     this.success,
				error:       this.error,
				reset:		 true
	        });
		},
		success: function(data) {
			empCollection.reset();
			empCollection.set(data);
		},
		error: function(error){
			console.log("error = "+error);
		}
	});
	
	empCollection = new EmpCollection();
	
});