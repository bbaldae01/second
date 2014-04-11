$(document).ready(function(){

	var EmpView = Backbone.View.extend({
		initialize: function(){
			console.log("EmpView  initialize()");
		},
		tagName : 'tr',
		template: _.template($('#emp-template').html()),
		render: function(){
			this.$el.html(this.template(this.model.toJSON()));
			return this;
		}
	});
	
	var EmpListView = Backbone.View.extend({
		el: $('#emp-list'),
		initialize: function(){
			console.log("EmpListView  initialize()");
		},
		render: function(){
			console.log("EmpListView render()");
			this.$el.html('');
			this.collection.refreshData();
			this.collection.each(function(emp){
				var empView = new EmpView({model: emp});
				this.$el.append(empView.render().el);
			}, this);
			return this;
		}
	});
	
	var empListView = new EmpListView({collection: empCollection});
	
	var EmpRouter = Backbone.Router.extend({
		initialize: function(){
			console.log("EmpRouter  initialize()");
		},
		routes: {
			'employee/selectEmployeeList': 'selectEmployeeList'
		},
		selectEmployeeList: function(){
			console.log("EmpRouter > selectEmployeeList()");
			empListView.render();
		}
	});

	new EmpRouter();
	Backbone.history.start();

});
