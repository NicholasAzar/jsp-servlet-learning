<html>
    <body>
        <h1>beer-v1</h1>
        <div>
            <h1 align="center">Beer Selection Page</h1>
            <form method="POST" action="SelectBeer.do">
                <p>
                    Select beer characteristics <br />
                    Color:
                </p>
                <select name="color" size="1" title="color">
                    <option value="light">light</option>
                    <option value="amber">amber</option>
                    <option value="brown">brown</option>
                    <option value="dark">dark</option>
                </select>
                <br />
                <div style="text-align: center;">
                    <input type="submit"/>
                </div>
            </form>
        </div>
        <div>
            <span>Test init params: </span>
            <form method="get" action="TestInitParams.do">
                <input type="submit"/>
            </form>
        </div>
    </body>
</html>