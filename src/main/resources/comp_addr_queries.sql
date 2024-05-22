-- Create the company table
CREATE TABLE companies (
    company_number VARCHAR(20) PRIMARY KEY,
    title VARCHAR(255),
    company_status VARCHAR(50),
    company_type VARCHAR(50),
    date_of_creation DATE,
    address_snippet TEXT,
    description TEXT
);

-- Create the address table with a foreign key reference to the company table
CREATE TABLE addresses (
    address_id SERIAL PRIMARY KEY,
    company_number VARCHAR(20),
    premises VARCHAR(255),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    locality VARCHAR(100),
    address_line_1 VARCHAR(255),
    FOREIGN KEY (company_number) REFERENCES companies(company_number)
);

-- Insert data into the company table
INSERT INTO companies (
    company_number, title, company_status, company_type, date_of_creation, address_snippet, description
) VALUES (
    '06500244', 'BBC LIMITED', 'active', 'ltd', '2008-02-11', 
    'Boswell Cottage Main Street, North Leverton, Retford, England, DN22 0AD', 
    '06500244 - Incorporated on 11 February 2008'
);

-- Insert data into the address table
INSERT INTO addresses (
    company_number, premises, postal_code, country, locality, address_line_1
) VALUES (
    '06500244', 'Boswell Cottage Main Street', 'DN22 0AD', 'England', 'Retford', 'North Leverton'
);