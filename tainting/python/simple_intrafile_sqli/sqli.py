# https://realpython.com/prevent-python-sql-injection/

import psycopg2

connection = psycopg2.connect(
    host="localhost",
    database="psycopgtest",
    user="postgres",
    password=None,
)
connection.set_session(autocommit=True)

# BAD EXAMPLE. DON'T DO THIS!
def is_admin(username: str) -> bool:
    with connection.cursor() as cursor:
        cursor.execute("""
            SELECT
                admin
            FROM
                users
            WHERE
                username = '%s'
        """ % username)
        result = cursor.fetchone()

    if result is None:
        # User does not exist
        return False

    admin, = result
    return admin

def data():
    return user_input

def cleanse(x):
    return sanitize(x)

def dummy(x):
    return x

def ok():
    x = data()
    y = cleanse(x)
    # OK:
    return is_admin(y)

def bad():
    x = data()
    y = dummy(x)
    # DEEP:
    return is_admin(y)
