/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  guest
 * Created: Oct 27, 2026
 */

ALTER TABLE produtos
ALTER COLUMN eh_visivel SET DEFAULT TRUE;

ALTER TABLE produtos
ALTER COLUMN eh_visivel SET NOT NULL;