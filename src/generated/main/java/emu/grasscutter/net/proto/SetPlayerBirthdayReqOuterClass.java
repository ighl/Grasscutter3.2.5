// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SetPlayerBirthdayReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetPlayerBirthdayReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetPlayerBirthdayReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetPlayerBirthdayReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetPlayerBirthdayReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSetPlayerBirthdayReq.proto\u001a\u000eBirthday.proto\"3\n\u0014SetPlayerBirthdayReq\u0012\u001b\n\bbirthday\u0018\t \u0001(\u000b2\t.BirthdayB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetPlayerBirthdayReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BirthdayOuterClass.getDescriptor() });
        internal_static_SetPlayerBirthdayReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetPlayerBirthdayReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor, new String[] { "Birthday" });
        BirthdayOuterClass.getDescriptor();
    }
    
    public static final class SetPlayerBirthdayReq extends GeneratedMessageV3 implements SetPlayerBirthdayReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BIRTHDAY_FIELD_NUMBER = 9;
        private BirthdayOuterClass.Birthday birthday_;
        private byte memoizedIsInitialized;
        private static final SetPlayerBirthdayReq DEFAULT_INSTANCE;
        private static final Parser<SetPlayerBirthdayReq> PARSER;
        
        private SetPlayerBirthdayReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetPlayerBirthdayReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetPlayerBirthdayReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetPlayerBirthdayReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 74: {
                            BirthdayOuterClass.Birthday.Builder subBuilder = null;
                            if (this.birthday_ != null) {
                                subBuilder = this.birthday_.toBuilder();
                            }
                            this.birthday_ = input.readMessage(BirthdayOuterClass.Birthday.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.birthday_);
                                this.birthday_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerBirthdayReq.class, Builder.class);
        }
        
        @Override
        public boolean hasBirthday() {
            return this.birthday_ != null;
        }
        
        @Override
        public BirthdayOuterClass.Birthday getBirthday() {
            return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
        }
        
        @Override
        public BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
            return this.getBirthday();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.birthday_ != null) {
                output.writeMessage(9, this.getBirthday());
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.birthday_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getBirthday());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetPlayerBirthdayReq)) {
                return super.equals(obj);
            }
            final SetPlayerBirthdayReq other = (SetPlayerBirthdayReq)obj;
            return this.hasBirthday() == other.hasBirthday() && (!this.hasBirthday() || this.getBirthday().equals(other.getBirthday())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBirthday()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getBirthday().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetPlayerBirthdayReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayReq.PARSER, input);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayReq.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerBirthdayReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerBirthdayReq.PARSER, input);
        }
        
        public static SetPlayerBirthdayReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerBirthdayReq.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayReq.PARSER, input);
        }
        
        public static SetPlayerBirthdayReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetPlayerBirthdayReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetPlayerBirthdayReq prototype) {
            return SetPlayerBirthdayReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetPlayerBirthdayReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetPlayerBirthdayReq getDefaultInstance() {
            return SetPlayerBirthdayReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetPlayerBirthdayReq> parser() {
            return SetPlayerBirthdayReq.PARSER;
        }
        
        @Override
        public Parser<SetPlayerBirthdayReq> getParserForType() {
            return SetPlayerBirthdayReq.PARSER;
        }
        
        @Override
        public SetPlayerBirthdayReq getDefaultInstanceForType() {
            return SetPlayerBirthdayReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetPlayerBirthdayReq();
            PARSER = new AbstractParser<SetPlayerBirthdayReq>() {
                @Override
                public SetPlayerBirthdayReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetPlayerBirthdayReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetPlayerBirthdayReqOrBuilder
        {
            private BirthdayOuterClass.Birthday birthday_;
            private SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder> birthdayBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerBirthdayReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetPlayerBirthdayReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = null;
                }
                else {
                    this.birthday_ = null;
                    this.birthdayBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
            }
            
            @Override
            public SetPlayerBirthdayReq getDefaultInstanceForType() {
                return SetPlayerBirthdayReq.getDefaultInstance();
            }
            
            @Override
            public SetPlayerBirthdayReq build() {
                final SetPlayerBirthdayReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetPlayerBirthdayReq buildPartial() {
                final SetPlayerBirthdayReq result = new SetPlayerBirthdayReq(this);
                if (this.birthdayBuilder_ == null) {
                    result.birthday_ = this.birthday_;
                }
                else {
                    result.birthday_ = this.birthdayBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SetPlayerBirthdayReq) {
                    return this.mergeFrom((SetPlayerBirthdayReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetPlayerBirthdayReq other) {
                if (other == SetPlayerBirthdayReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasBirthday()) {
                    this.mergeBirthday(other.getBirthday());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SetPlayerBirthdayReq parsedMessage = null;
                try {
                    parsedMessage = SetPlayerBirthdayReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetPlayerBirthdayReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasBirthday() {
                return this.birthdayBuilder_ != null || this.birthday_ != null;
            }
            
            @Override
            public BirthdayOuterClass.Birthday getBirthday() {
                if (this.birthdayBuilder_ == null) {
                    return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
                }
                return this.birthdayBuilder_.getMessage();
            }
            
            public Builder setBirthday(final BirthdayOuterClass.Birthday value) {
                if (this.birthdayBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.birthday_ = value;
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBirthday(final BirthdayOuterClass.Birthday.Builder builderForValue) {
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBirthday(final BirthdayOuterClass.Birthday value) {
                if (this.birthdayBuilder_ == null) {
                    if (this.birthday_ != null) {
                        this.birthday_ = BirthdayOuterClass.Birthday.newBuilder(this.birthday_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.birthday_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBirthday() {
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = null;
                    this.onChanged();
                }
                else {
                    this.birthday_ = null;
                    this.birthdayBuilder_ = null;
                }
                return this;
            }
            
            public BirthdayOuterClass.Birthday.Builder getBirthdayBuilder() {
                this.onChanged();
                return this.getBirthdayFieldBuilder().getBuilder();
            }
            
            @Override
            public BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
                if (this.birthdayBuilder_ != null) {
                    return this.birthdayBuilder_.getMessageOrBuilder();
                }
                return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
            }
            
            private SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder> getBirthdayFieldBuilder() {
                if (this.birthdayBuilder_ == null) {
                    this.birthdayBuilder_ = new SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder>(this.getBirthday(), this.getParentForChildren(), this.isClean());
                    this.birthday_ = null;
                }
                return this.birthdayBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SetPlayerBirthdayReqOrBuilder extends MessageOrBuilder
    {
        boolean hasBirthday();
        
        BirthdayOuterClass.Birthday getBirthday();
        
        BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder();
    }
}
