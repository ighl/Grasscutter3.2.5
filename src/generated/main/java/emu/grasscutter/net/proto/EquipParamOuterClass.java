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

public final class EquipParamOuterClass
{
    private static final Descriptors.Descriptor internal_static_EquipParam_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EquipParam_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EquipParamOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EquipParamOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010EquipParam.proto\"Z\n\nEquipParam\u0012\u000f\n\u0007item_id\u0018\u0001 \u0001(\r\u0012\u0010\n\bitem_num\u0018\u0002 \u0001(\r\u0012\u0012\n\nitem_level\u0018\u0003 \u0001(\r\u0012\u0015\n\rpromote_level\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EquipParamOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EquipParam_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EquipParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EquipParamOuterClass.internal_static_EquipParam_descriptor, new String[] { "ItemId", "ItemNum", "ItemLevel", "PromoteLevel" });
    }
    
    public static final class EquipParam extends GeneratedMessageV3 implements EquipParamOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_ID_FIELD_NUMBER = 1;
        private int itemId_;
        public static final int ITEM_NUM_FIELD_NUMBER = 2;
        private int itemNum_;
        public static final int ITEM_LEVEL_FIELD_NUMBER = 3;
        private int itemLevel_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 4;
        private int promoteLevel_;
        private byte memoizedIsInitialized;
        private static final EquipParam DEFAULT_INSTANCE;
        private static final Parser<EquipParam> PARSER;
        
        private EquipParam(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EquipParam() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EquipParam();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EquipParam(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.itemNum_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.itemLevel_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.promoteLevel_ = input.readUInt32();
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
            return EquipParamOuterClass.internal_static_EquipParam_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipParamOuterClass.internal_static_EquipParam_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipParam.class, Builder.class);
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public int getItemNum() {
            return this.itemNum_;
        }
        
        @Override
        public int getItemLevel() {
            return this.itemLevel_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
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
            if (this.itemNum_ != 0) {
                output.writeUInt32(2, this.itemNum_);
            }
            if (this.itemLevel_ != 0) {
                output.writeUInt32(3, this.itemLevel_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(4, this.promoteLevel_);
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
            if (this.itemNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.itemNum_);
            }
            if (this.itemLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.itemLevel_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.promoteLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EquipParam)) {
                return super.equals(obj);
            }
            final EquipParam other = (EquipParam)obj;
            return this.getItemId() == other.getItemId() && this.getItemNum() == other.getItemNum() && this.getItemLevel() == other.getItemLevel() && this.getPromoteLevel() == other.getPromoteLevel() && this.unknownFields.equals(other.unknownFields);
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
            hash = 53 * hash + this.getItemNum();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getItemLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getPromoteLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EquipParam parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data);
        }
        
        public static EquipParam parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EquipParam parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data);
        }
        
        public static EquipParam parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EquipParam parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data);
        }
        
        public static EquipParam parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EquipParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EquipParam parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EquipParam.PARSER, input);
        }
        
        public static EquipParam parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EquipParam.PARSER, input, extensionRegistry);
        }
        
        public static EquipParam parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EquipParam.PARSER, input);
        }
        
        public static EquipParam parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EquipParam.PARSER, input, extensionRegistry);
        }
        
        public static EquipParam parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EquipParam.PARSER, input);
        }
        
        public static EquipParam parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EquipParam.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EquipParam.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EquipParam prototype) {
            return EquipParam.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EquipParam.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EquipParam getDefaultInstance() {
            return EquipParam.DEFAULT_INSTANCE;
        }
        
        public static Parser<EquipParam> parser() {
            return EquipParam.PARSER;
        }
        
        @Override
        public Parser<EquipParam> getParserForType() {
            return EquipParam.PARSER;
        }
        
        @Override
        public EquipParam getDefaultInstanceForType() {
            return EquipParam.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EquipParam();
            PARSER = new AbstractParser<EquipParam>() {
                @Override
                public EquipParam parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EquipParam(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EquipParamOrBuilder
        {
            private int itemId_;
            private int itemNum_;
            private int itemLevel_;
            private int promoteLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EquipParamOuterClass.internal_static_EquipParam_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EquipParamOuterClass.internal_static_EquipParam_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipParam.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EquipParam.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemId_ = 0;
                this.itemNum_ = 0;
                this.itemLevel_ = 0;
                this.promoteLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EquipParamOuterClass.internal_static_EquipParam_descriptor;
            }
            
            @Override
            public EquipParam getDefaultInstanceForType() {
                return EquipParam.getDefaultInstance();
            }
            
            @Override
            public EquipParam build() {
                final EquipParam result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EquipParam buildPartial() {
                final EquipParam result = new EquipParam(this);
                result.itemId_ = this.itemId_;
                result.itemNum_ = this.itemNum_;
                result.itemLevel_ = this.itemLevel_;
                result.promoteLevel_ = this.promoteLevel_;
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
                if (other instanceof EquipParam) {
                    return this.mergeFrom((EquipParam)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EquipParam other) {
                if (other == EquipParam.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getItemNum() != 0) {
                    this.setItemNum(other.getItemNum());
                }
                if (other.getItemLevel() != 0) {
                    this.setItemLevel(other.getItemLevel());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
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
                EquipParam parsedMessage = null;
                try {
                    parsedMessage = EquipParam.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EquipParam)e.getUnfinishedMessage();
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
            public int getItemNum() {
                return this.itemNum_;
            }
            
            public Builder setItemNum(final int value) {
                this.itemNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemNum() {
                this.itemNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getItemLevel() {
                return this.itemLevel_;
            }
            
            public Builder setItemLevel(final int value) {
                this.itemLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemLevel() {
                this.itemLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
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
    
    public interface EquipParamOrBuilder extends MessageOrBuilder
    {
        int getItemId();
        
        int getItemNum();
        
        int getItemLevel();
        
        int getPromoteLevel();
    }
}
