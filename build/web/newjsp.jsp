<!DOCTYPE html>
    <html>
    <head>
    <script>
    function addList(){
    var select = document.getElementById("month");
    for(var i = 2011; i >= 1900; --i) {
    var option = document.createElement('option');
    option.text = option.value = i;
    select.add(option, 0);
      }
     }
    </script>
    </head>

    <body>

        <select id="year" name="year" onchange="addList()">
            <option>a</option>
             <option>b</option>
        </select>
<select id="month" name="month" id="month">
           
        </select>
    </body>
    </html> 