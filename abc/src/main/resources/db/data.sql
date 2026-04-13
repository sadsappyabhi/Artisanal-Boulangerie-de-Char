INSERT INTO
    menu_item_categories (category_description)
VALUES
    ('Panes'),
    ('Panes Dulces'),
    ('Postres');

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Pain au Levain (Country Sourdough)', 'Naturally fermented, crusty exterior, soft airy crumb', 6.50, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Traditional Baguette', 'Classic french baguette, baked fresh daily', 4.25, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Pan Sobao Artesanal', 'Puerto Rican-style soft bread', 5.75, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Rosemary & Sea Salt Focaccia', 'Extra virgin olive oil, flaky salt, fresh herbs', 5.50, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Pan de Guayaba y Queso', 'Sweet guava paste and cream cheese swirled into brioche dough', 6.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes Dulces'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Croissant au Beurre', 'Classic flaky, all-butter croissant', 3.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes Dulces'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Croissant de Almendra', 'Almond cream filling, toasted almonds, powdered sugar', 4.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes Dulces'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Croissnat Boricua (Guava & Queso)', 'French laminated dough filled with guava paste & sweet cream cheese', 5.25, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes Dulces'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Mallorca Francesca', 'Puerto Rican soft sweet roll with European butter and sugar dusting', 4.50, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Panes Dulces'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Pain au Chocolat', 'Dark French chocolate batons in flaky pastry', 4.50, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Quesito Hoja de Oro', 'Caramelized puff pastry with sweetened cream cheese', 3.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Flan Parisien con Ron Añejo', 'Silky baked custard with aged Puerto Rican rum caramel', 6.50, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Tarta de Maracuyá', 'Passion fruit curd in a buttery French tart shell', 6.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Mousse au Chocolate y Ron', 'Dark chocolate mousse infused with Caribbean rum', 6.75, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));

INSERT INTO menu_items (name, description, price, category_id)
VALUES ('Crème Brûlée de Coco', 'Coconut custard with torched sugar crust', 6.95, (SELECT category_id FROM menu_item_categories WHERE category_description = 'Postres'));