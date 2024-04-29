CREATE UNIQUE INDEX IF NOT EXISTS index_usuarios_email ON public.usuarios USING btree (email) WHERE (deleted_at IS NULL);

INSERT INTO public.usuarios
(nome, email, senha)
VALUES('admin', 'admin@senac.com.br', '1234') ON conflict DO nothing;