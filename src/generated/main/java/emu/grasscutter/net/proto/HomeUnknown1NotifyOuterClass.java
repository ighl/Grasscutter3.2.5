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

public final class HomeUnknown1NotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeUnknown1Notify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeUnknown1Notify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeUnknown1NotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeUnknown1NotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018HomeUnknown1Notify.proto\"0\n\u0012HomeUnknown1Notify\u0012\u001a\n\u0012is_enter_edit_mode\u0018\f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeUnknown1NotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeUnknown1Notify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeUnknown1Notify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_descriptor, new String[] { "IsEnterEditMode" });
    }
    
    public static final class HomeUnknown1Notify extends GeneratedMessageV3 implements HomeUnknown1NotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ENTER_EDIT_MODE_FIELD_NUMBER = 12;
        private boolean isEnterEditMode_;
        private byte memoizedIsInitialized;
        private static final HomeUnknown1Notify DEFAULT_INSTANCE;
        private static final Parser<HomeUnknown1Notify> PARSER;
        
        private HomeUnknown1Notify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeUnknown1Notify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeUnknown1Notify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeUnknown1Notify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            this.isEnterEditMode_ = input.readBool();
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
            return HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUnknown1Notify.class, Builder.class);
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
                output.writeBool(12, this.isEnterEditMode_);
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
                size += CodedOutputStream.computeBoolSize(12, this.isEnterEditMode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeUnknown1Notify)) {
                return super.equals(obj);
            }
            final HomeUnknown1Notify other = (HomeUnknown1Notify)obj;
            return this.getIsEnterEditMode() == other.getIsEnterEditMode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEnterEditMode());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeUnknown1Notify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data);
        }
        
        public static HomeUnknown1Notify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUnknown1Notify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data);
        }
        
        public static HomeUnknown1Notify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUnknown1Notify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data);
        }
        
        public static HomeUnknown1Notify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUnknown1Notify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUnknown1Notify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUnknown1Notify.PARSER, input);
        }
        
        public static HomeUnknown1Notify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUnknown1Notify.PARSER, input, extensionRegistry);
        }
        
        public static HomeUnknown1Notify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUnknown1Notify.PARSER, input);
        }
        
        public static HomeUnknown1Notify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUnknown1Notify.PARSER, input, extensionRegistry);
        }
        
        public static HomeUnknown1Notify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUnknown1Notify.PARSER, input);
        }
        
        public static HomeUnknown1Notify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUnknown1Notify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeUnknown1Notify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeUnknown1Notify prototype) {
            return HomeUnknown1Notify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeUnknown1Notify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeUnknown1Notify getDefaultInstance() {
            return HomeUnknown1Notify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeUnknown1Notify> parser() {
            return HomeUnknown1Notify.PARSER;
        }
        
        @Override
        public Parser<HomeUnknown1Notify> getParserForType() {
            return HomeUnknown1Notify.PARSER;
        }
        
        @Override
        public HomeUnknown1Notify getDefaultInstanceForType() {
            return HomeUnknown1Notify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeUnknown1Notify();
            PARSER = new AbstractParser<HomeUnknown1Notify>() {
                @Override
                public HomeUnknown1Notify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeUnknown1Notify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeUnknown1NotifyOrBuilder
        {
            private boolean isEnterEditMode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUnknown1Notify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeUnknown1Notify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isEnterEditMode_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeUnknown1NotifyOuterClass.internal_static_HomeUnknown1Notify_descriptor;
            }
            
            @Override
            public HomeUnknown1Notify getDefaultInstanceForType() {
                return HomeUnknown1Notify.getDefaultInstance();
            }
            
            @Override
            public HomeUnknown1Notify build() {
                final HomeUnknown1Notify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeUnknown1Notify buildPartial() {
                final HomeUnknown1Notify result = new HomeUnknown1Notify(this);
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
                if (other instanceof HomeUnknown1Notify) {
                    return this.mergeFrom((HomeUnknown1Notify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeUnknown1Notify other) {
                if (other == HomeUnknown1Notify.getDefaultInstance()) {
                    return this;
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
                HomeUnknown1Notify parsedMessage = null;
                try {
                    parsedMessage = HomeUnknown1Notify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeUnknown1Notify)e.getUnfinishedMessage();
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
    
    public interface HomeUnknown1NotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsEnterEditMode();
    }
}
