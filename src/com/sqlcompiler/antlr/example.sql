CREATE FUNCTION f1 ( p_name INT)
RETURNS string
IS
BEGIN
RETURN ('Welcome '|| p_name);
END;
