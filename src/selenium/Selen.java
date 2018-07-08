package selenium;

/* https://w3c.github.io/webdriver/



Element Displayedness
        Although WebDriver does not define a primitive to ascertain the visibility of an element in the viewport, we
        acknowledge that it is an important feature for many users. Here we include a recommended approach which will
        give a simplified approximation of an element’s visibility, but please note that it relies only on
        tree-traversal, and only covers a subset of visibility checks.
        The visibility of an element is guided by what is perceptually visible to the human eye. In this context,
        an element's displayedness does not relate to the visibility or display style properties.
        The approach recommended to implementors to ascertain an element's visibility was originally developed by
        the Selenium project, and is based on crude approximations about an element's nature and relationship in the
        tree. An element is in general to be considered visible if any part of it is drawn on the canvas within the
        boundaries of the viewport.
        The element displayed algorithm is a boolean state where true signifies that the element is displayed and false
        signifies that the element is not displayed. To compute the state on element, invoke the Call(bot.dom.isShown,
        null, element). If doing so does not produce an error, return the return value from this function call.
        Otherwise return an error with error code unknown error.
        This function is typically exposed to GET requests with a URI Template of
        /session/{session id}/element/{element id}/displayed.*/

public class Selen {
}
