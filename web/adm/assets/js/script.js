$(function(){
  
   $('tr #btn-eliminar2').click(function(e){
      e.preventDefault();
      var opcion = confirm("Desea Eliminar el Curso");
      
      if(opcion){
           var fila = $(this).parent().parent();           
           var idproducto2  = fila.find('#id2').text();      
           var data = {val:idproducto2};
           $.post("../controllercurso", data, function(res, est, jqXHR){
             location.reload(true);
           });
      }    
   });
   
    $('tr #btn-eliminar').click(function(e){
      e.preventDefault();
      var opcion = confirm("Desea Eliminar el Usuario");
      
      if(opcion){
           var fila = $(this).parent().parent();           
           var idproducto  = fila.find('#id').text();      
           var data = {val:idproducto};
           $.post("../eliminarprofesor", data, function(res, est, jqXHR){
             location.reload(true);
           });
      }    
   });
   
});