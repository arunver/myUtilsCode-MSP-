<html>
<head>
	<title>MSP Accruals</title>
</head>
<link rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$.ajax({
			url:"GetData",
			type:"Get",
			dataType:"json",
			beforeSend: function() {
				$('.mask').addClass('ajax');
			  },
			success:function(response)
			{
					
				$('.mask').removeClass('ajax');
				var result= JSON.stringify(response);			
				var data= JSON.parse(result);
				for(var i=0; i<data.length; i++)
				{
					var datarow='';
					if(i%2==0)
					{
						datarow=$('<tr id="row'+i+'" class="even"/>');
					}
					else
					{
						datarow=$('<tr id="row'+i+'" class="odd"/>');
					}
					
					datarow.append('<td>'+data[i].id+'</td>').
						append('<td>'+data[i].resourceId+'</td>').
						//datarow.append('<td>'+data[i].modified+'</td>').
						append('<td>'+data[i].resourceName+'</td>').
						//datarow.append('<td>'+data[i].resourceType+'</td>').
						append('<td>'+data[i].role+'</td>').
						append('<td>'+data[i].rate+'</td>').
						append('<td>'+data[i].projectId+'</td>').
						append('<td>'+data[i].projectName+'</td>').
						//datarow.append('<td>'+data[i].projectType+'</td>').
						append('<td>'+data[i].accountManager+'</td>').
						//datarow.append('<td>'+data[i].trackName+'</td>').
						append('<td>'+data[i].trackManager+'</td>').
						//datarow.append('<td>'+data[i].domain+'</td>').
						//datarow.append('<td>'+data[i].weekNum+'</td>').
						append('<td>'+data[i].weekEnd+'</td>').
						append('<td>'+data[i].hours+'</td>').
						append('<td>'+data[i].amount+'</td>').
						append('<td>'+data[i].costCenter+'</td>').
						append('<td>'+data[i].vendorName+'</td>').
						append('<td>'+data[i].accountType+'</td>').
						append('<td>'+data[i].account+'</td>');
						//datarow.append('<td>'+data[i].period+'</td>').
						//datarow.append('<td>'+data[i].vendorNumber+'</td>').
					//	datarow.append('<td>'+data[i].vendorSite+'</td>').
						//datarow.append('<td>'+data[i].PO+'</td>').
						//datarow.append('<td>'+data[i].invoiceNumber+'</td>').
						//datarow.append('<td>'+data[i].invoiceDate+'</td>').
						//datarow.append('<td>'+data[i].changeWorkOrderNumber+'</td>').
						//datarow.append('<td>'+data[i].comments+'</td>').
						//datarow.append('<td>'+data[i].reviewed+'</td>').
						//datarow.append('<td>'+data[i].reviewedBy+'</td>').
						//datarow.append('<td>'+data[i].reviewDate+'</td>');
					$('.as_gridder_table').append(datarow);
				}

				$('th').click(function(){
					//alert("data");
					var table =$(this).parents('table').eq(0)
					var rows = table.find('tr:gt(0)').toArray().sort(comparer($(this).index()))
					this.asc = !this.asc
					if (!this.asc){
							rows = rows.reverse();
						}
					for (var i = 0; i < rows.length; i++){
							table.append(rows[i]);
						}
				});
			
				function comparer(index) {
						return function(a, b) {
					var valA = getCellValue(a, index), valB = getCellValue(b, index);
					return $.isNumeric(valA) && $.isNumeric(valB) ?valA - valB: valA.localeCompare(valB);
					}
				}
				
				function getCellValue(row, index){ 
					return $(row).children('td').eq(index).html();}
			}
		
			
		});

		$('#export').click(function(){
					alert("inside export");
					$.ajax({
						url:"GetExcel",
						type:"Get",
						success:function(response)
						{
							alert("file available for download "+response);
							
							var link=$('<a href="/MSPTool/download">download</a>');
							$('#exportData').html(link);
							
						}
					});
				});
		
	});
</script>

<style>

</style>
<body>

	<h1 class="h1"><a href="">MSP Tool Data Grid</a></h1>
	<div class="as_wrapper">
	
	<div class="as_grid_container">
        <div class="as_gridder" id="as_gridder" style="height:400px;">
        	<table class="as_gridder_table">
					<tr class="grid_header" >
						<th><div class="grid_heading">Sno</div></th>
						<th><div class="grid_heading">ResourceID</div></th>
						<th><div class="grid_heading">ResourceName</div></th>
						<th><div class="grid_heading">Role</div></th>
						<th><div class="grid_heading">Rate</div></th>
						<th><div class="grid_heading">ProjectID</div></th>
						<th><div class="grid_heading">ProjectName</div></th>
						<th><div class="grid_heading">AccountManager</div></th>					
						<th><div class="grid_heading">TrackManager</div></th>
						<th><div class="grid_heading">WeekEnd</div></th>
						<th><div class="grid_heading">Hours</div></th>
						<th><div class="grid_heading">Amount</div></th>
						<th><div class="grid_heading">CostCentre</div></th>
						<th><div class="grid_heading">VendorName</div></th>
						<th><div class="grid_heading">AccountType</div></th>
						<th><div class="grid_heading">Account</div></th>
					</tr>
					
		</table>
		
        </div> <!-- GRID LOADER -->
    </div>
</div>

<div id="exportData">
		<input type="button" name="export" value="export" id="export"/>
		
	</div>
	
		
	
</body>
</html>