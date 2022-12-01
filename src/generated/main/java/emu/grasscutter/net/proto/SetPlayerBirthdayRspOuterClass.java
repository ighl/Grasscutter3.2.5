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

public final class SetPlayerBirthdayRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetPlayerBirthdayRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetPlayerBirthdayRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetPlayerBirthdayRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetPlayerBirthdayRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSetPlayerBirthdayRsp.proto\u001a\u000eBirthday.proto\"D\n\u0014SetPlayerBirthdayRsp\u0012\u001b\n\bbirthday\u0018\u0002 \u0001(\u000b2\t.Birthday\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetPlayerBirthdayRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BirthdayOuterClass.getDescriptor() });
        internal_static_SetPlayerBirthdayRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetPlayerBirthdayRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor, new String[] { "Birthday", "Retcode" });
        BirthdayOuterClass.getDescriptor();
    }
    
    public static final class SetPlayerBirthdayRsp extends GeneratedMessageV3 implements SetPlayerBirthdayRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BIRTHDAY_FIELD_NUMBER = 2;
        private BirthdayOuterClass.Birthday birthday_;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SetPlayerBirthdayRsp DEFAULT_INSTANCE;
        private static final Parser<SetPlayerBirthdayRsp> PARSER;
        
        private SetPlayerBirthdayRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetPlayerBirthdayRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetPlayerBirthdayRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetPlayerBirthdayRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
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
                        case 40: {
                            this.retcode_ = input.readInt32();
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
            return SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerBirthdayRsp.class, Builder.class);
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
        public int getRetcode() {
            return this.retcode_;
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
                output.writeMessage(2, this.getBirthday());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
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
                size += CodedOutputStream.computeMessageSize(2, this.getBirthday());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetPlayerBirthdayRsp)) {
                return super.equals(obj);
            }
            final SetPlayerBirthdayRsp other = (SetPlayerBirthdayRsp)obj;
            return this.hasBirthday() == other.hasBirthday() && (!this.hasBirthday() || this.getBirthday().equals(other.getBirthday())) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBirthday()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getBirthday().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerBirthdayRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayRsp.PARSER, input);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerBirthdayRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerBirthdayRsp.PARSER, input);
        }
        
        public static SetPlayerBirthdayRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerBirthdayRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayRsp.PARSER, input);
        }
        
        public static SetPlayerBirthdayRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerBirthdayRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetPlayerBirthdayRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetPlayerBirthdayRsp prototype) {
            return SetPlayerBirthdayRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetPlayerBirthdayRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetPlayerBirthdayRsp getDefaultInstance() {
            return SetPlayerBirthdayRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetPlayerBirthdayRsp> parser() {
            return SetPlayerBirthdayRsp.PARSER;
        }
        
        @Override
        public Parser<SetPlayerBirthdayRsp> getParserForType() {
            return SetPlayerBirthdayRsp.PARSER;
        }
        
        @Override
        public SetPlayerBirthdayRsp getDefaultInstanceForType() {
            return SetPlayerBirthdayRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetPlayerBirthdayRsp();
            PARSER = new AbstractParser<SetPlayerBirthdayRsp>() {
                @Override
                public SetPlayerBirthdayRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetPlayerBirthdayRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetPlayerBirthdayRspOrBuilder
        {
            private BirthdayOuterClass.Birthday birthday_;
            private SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder> birthdayBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerBirthdayRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetPlayerBirthdayRsp.alwaysUseFieldBuilders) {}
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
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
            }
            
            @Override
            public SetPlayerBirthdayRsp getDefaultInstanceForType() {
                return SetPlayerBirthdayRsp.getDefaultInstance();
            }
            
            @Override
            public SetPlayerBirthdayRsp build() {
                final SetPlayerBirthdayRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetPlayerBirthdayRsp buildPartial() {
                final SetPlayerBirthdayRsp result = new SetPlayerBirthdayRsp(this);
                if (this.birthdayBuilder_ == null) {
                    result.birthday_ = this.birthday_;
                }
                else {
                    result.birthday_ = this.birthdayBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof SetPlayerBirthdayRsp) {
                    return this.mergeFrom((SetPlayerBirthdayRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetPlayerBirthdayRsp other) {
                if (other == SetPlayerBirthdayRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.hasBirthday()) {
                    this.mergeBirthday(other.getBirthday());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                SetPlayerBirthdayRsp parsedMessage = null;
                try {
                    parsedMessage = SetPlayerBirthdayRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetPlayerBirthdayRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
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
    
    public interface SetPlayerBirthdayRspOrBuilder extends MessageOrBuilder
    {
        boolean hasBirthday();
        
        BirthdayOuterClass.Birthday getBirthday();
        
        BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder();
        
        int getRetcode();
    }
}
