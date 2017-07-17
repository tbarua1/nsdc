<form action="Test">
    <select id="choice" multiple="multiple" name="sites">
  <option value="1">One</option>
  <option value="2">two</option>
  <option value="3">three</option>
</select>
<script type="text/javascript">


var select = document.getElementById( 'choice' );
for ( var i = 0; i < select.options.length; i++ )
{  select.options[i].selected = true;
 }

</script>
    <input type="submit" value="submit">
</form>