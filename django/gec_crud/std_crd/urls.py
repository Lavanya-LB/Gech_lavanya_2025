from django.urls import path
from . import views



urlpatterns = [
    path("", views.home, name="home"),
    path("edit/<int:id>", views.edit_student, name="edit"),
    # path("delete/<int:id>/", views.delete_student, name="delete_student"),
    # path("update/<int:id>/", views.update_student, name="update_student"),
    path('about/', views.about, name='about'),
    path("delete/<int:id>", views.delete_student, name="delete")

]