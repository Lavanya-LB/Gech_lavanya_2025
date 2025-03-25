from django import forms
from .models import student

class studentsForm(forms.ModelForm):
    class Meta:
        model = student  # Link to the 'student' model
        fields = ['name', 'email', 'password']  # Specify the fields to include in the form

        widgets = {
            "name": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter your name"}
            ),
            "email": forms.EmailInput(
                attrs={"class": "form-control", "placeholder": "Enter your email"}
            ),
            "password": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter your password"}
            )
        }