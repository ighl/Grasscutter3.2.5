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

public final class GatherGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_GatherGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GatherGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GatherGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GatherGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016GatherGadgetInfo.proto\"<\n\u0010GatherGadgetInfo\u0012\u000f\n\u0007item_id\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fis_forbid_guest\u0018\u0002 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GatherGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GatherGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GatherGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor, new String[] { "ItemId", "IsForbidGuest" });
    }
    
    public static final class GatherGadgetInfo extends GeneratedMessageV3 implements GatherGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_ID_FIELD_NUMBER = 1;
        private int itemId_;
        public static final int IS_FORBID_GUEST_FIELD_NUMBER = 2;
        private boolean isForbidGuest_;
        private byte memoizedIsInitialized;
        private static final GatherGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<GatherGadgetInfo> PARSER;
        
        private GatherGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GatherGadgetInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GatherGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GatherGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.isForbidGuest_ = input.readBool();
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
            return GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GatherGadgetInfo.class, Builder.class);
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public boolean getIsForbidGuest() {
            return this.isForbidGuest_;
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
            if (this.itemId_ != 0) {
                output.writeUInt32(1, this.itemId_);
            }
            if (this.isForbidGuest_) {
                output.writeBool(2, this.isForbidGuest_);
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
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.itemId_);
            }
            if (this.isForbidGuest_) {
                size += CodedOutputStream.computeBoolSize(2, this.isForbidGuest_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GatherGadgetInfo)) {
                return super.equals(obj);
            }
            final GatherGadgetInfo other = (GatherGadgetInfo)obj;
            return this.getItemId() == other.getItemId() && this.getIsForbidGuest() == other.getIsForbidGuest() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsForbidGuest());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GatherGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static GatherGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GatherGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static GatherGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GatherGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static GatherGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GatherGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GatherGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GatherGadgetInfo.PARSER, input);
        }
        
        public static GatherGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GatherGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static GatherGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GatherGadgetInfo.PARSER, input);
        }
        
        public static GatherGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GatherGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static GatherGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GatherGadgetInfo.PARSER, input);
        }
        
        public static GatherGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GatherGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GatherGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GatherGadgetInfo prototype) {
            return GatherGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GatherGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GatherGadgetInfo getDefaultInstance() {
            return GatherGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<GatherGadgetInfo> parser() {
            return GatherGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<GatherGadgetInfo> getParserForType() {
            return GatherGadgetInfo.PARSER;
        }
        
        @Override
        public GatherGadgetInfo getDefaultInstanceForType() {
            return GatherGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GatherGadgetInfo();
            PARSER = new AbstractParser<GatherGadgetInfo>() {
                @Override
                public GatherGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GatherGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GatherGadgetInfoOrBuilder
        {
            private int itemId_;
            private boolean isForbidGuest_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GatherGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GatherGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemId_ = 0;
                this.isForbidGuest_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
            }
            
            @Override
            public GatherGadgetInfo getDefaultInstanceForType() {
                return GatherGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public GatherGadgetInfo build() {
                final GatherGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GatherGadgetInfo buildPartial() {
                final GatherGadgetInfo result = new GatherGadgetInfo(this);
                result.itemId_ = this.itemId_;
                result.isForbidGuest_ = this.isForbidGuest_;
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
                if (other instanceof GatherGadgetInfo) {
                    return this.mergeFrom((GatherGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GatherGadgetInfo other) {
                if (other == GatherGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getIsForbidGuest()) {
                    this.setIsForbidGuest(other.getIsForbidGuest());
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
                GatherGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = GatherGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GatherGadgetInfo)e.getUnfinishedMessage();
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
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsForbidGuest() {
                return this.isForbidGuest_;
            }
            
            public Builder setIsForbidGuest(final boolean value) {
                this.isForbidGuest_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsForbidGuest() {
                this.isForbidGuest_ = false;
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
    
    public interface GatherGadgetInfoOrBuilder extends MessageOrBuilder
    {
        int getItemId();
        
        boolean getIsForbidGuest();
    }
}
