// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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

public final class HomeChangeEditModeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeChangeEditModeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeChangeEditModeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeChangeEditModeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeChangeEditModeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bHomeChangeEditModeRsp.proto\"D\n\u0015HomeChangeEditModeRsp\u0012\u000f\n\u0007retcode\u0018\n \u0001(\u0005\u0012\u001a\n\u0012is_enter_edit_mode\u0018\u0005 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeChangeEditModeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeChangeEditModeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeChangeEditModeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_descriptor, new String[] { "Retcode", "IsEnterEditMode" });
    }
    
    public static final class HomeChangeEditModeRsp extends GeneratedMessageV3 implements HomeChangeEditModeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        public static final int IS_ENTER_EDIT_MODE_FIELD_NUMBER = 5;
        private boolean isEnterEditMode_;
        private byte memoizedIsInitialized;
        private static final HomeChangeEditModeRsp DEFAULT_INSTANCE;
        private static final Parser<HomeChangeEditModeRsp> PARSER;
        
        private HomeChangeEditModeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeChangeEditModeRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeChangeEditModeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeChangeEditModeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.isEnterEditMode_ = input.readBool();
                            continue;
                        }
                        case 80: {
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
            return HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChangeEditModeRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean getIsEnterEditMode() {
            return this.isEnterEditMode_;
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
            if (this.isEnterEditMode_) {
                output.writeBool(5, this.isEnterEditMode_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(10, this.retcode_);
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
            if (this.isEnterEditMode_) {
                size += CodedOutputStream.computeBoolSize(5, this.isEnterEditMode_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(10, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeChangeEditModeRsp)) {
                return super.equals(obj);
            }
            final HomeChangeEditModeRsp other = (HomeChangeEditModeRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getIsEnterEditMode() == other.getIsEnterEditMode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEnterEditMode());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeChangeEditModeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChangeEditModeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChangeEditModeRsp.PARSER, input);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChangeEditModeRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeChangeEditModeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChangeEditModeRsp.PARSER, input);
        }
        
        public static HomeChangeEditModeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChangeEditModeRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChangeEditModeRsp.PARSER, input);
        }
        
        public static HomeChangeEditModeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChangeEditModeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeChangeEditModeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeChangeEditModeRsp prototype) {
            return HomeChangeEditModeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeChangeEditModeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeChangeEditModeRsp getDefaultInstance() {
            return HomeChangeEditModeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeChangeEditModeRsp> parser() {
            return HomeChangeEditModeRsp.PARSER;
        }
        
        @Override
        public Parser<HomeChangeEditModeRsp> getParserForType() {
            return HomeChangeEditModeRsp.PARSER;
        }
        
        @Override
        public HomeChangeEditModeRsp getDefaultInstanceForType() {
            return HomeChangeEditModeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeChangeEditModeRsp();
            PARSER = new AbstractParser<HomeChangeEditModeRsp>() {
                @Override
                public HomeChangeEditModeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeChangeEditModeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeChangeEditModeRspOrBuilder
        {
            private int retcode_;
            private boolean isEnterEditMode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChangeEditModeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeChangeEditModeRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.isEnterEditMode_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeChangeEditModeRspOuterClass.internal_static_HomeChangeEditModeRsp_descriptor;
            }
            
            @Override
            public HomeChangeEditModeRsp getDefaultInstanceForType() {
                return HomeChangeEditModeRsp.getDefaultInstance();
            }
            
            @Override
            public HomeChangeEditModeRsp build() {
                final HomeChangeEditModeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeChangeEditModeRsp buildPartial() {
                final HomeChangeEditModeRsp result = new HomeChangeEditModeRsp(this);
                result.retcode_ = this.retcode_;
                result.isEnterEditMode_ = this.isEnterEditMode_;
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
                if (other instanceof HomeChangeEditModeRsp) {
                    return this.mergeFrom((HomeChangeEditModeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeChangeEditModeRsp other) {
                if (other == HomeChangeEditModeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getIsEnterEditMode()) {
                    this.setIsEnterEditMode(other.getIsEnterEditMode());
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
                HomeChangeEditModeRsp parsedMessage = null;
                try {
                    parsedMessage = HomeChangeEditModeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeChangeEditModeRsp)e.getUnfinishedMessage();
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
            public boolean getIsEnterEditMode() {
                return this.isEnterEditMode_;
            }
            
            public Builder setIsEnterEditMode(final boolean value) {
                this.isEnterEditMode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsEnterEditMode() {
                this.isEnterEditMode_ = false;
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
    
    public interface HomeChangeEditModeRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        boolean getIsEnterEditMode();
    }
}
