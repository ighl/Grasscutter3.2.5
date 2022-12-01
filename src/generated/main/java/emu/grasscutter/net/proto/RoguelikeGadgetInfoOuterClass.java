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

public final class RoguelikeGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RoguelikeGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoguelikeGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RoguelikeGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RoguelikeGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019RoguelikeGadgetInfo.proto\"e\n\u0013RoguelikeGadgetInfo\u0012\u0016\n\u000ecell_config_id\u0018\u0001 \u0001(\r\u0012\u0011\n\tcell_type\u0018\u0002 \u0001(\r\u0012\u0012\n\ncell_state\u0018\u0003 \u0001(\r\u0012\u000f\n\u0007cell_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RoguelikeGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_RoguelikeGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoguelikeGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_descriptor, new String[] { "CellConfigId", "CellType", "CellState", "CellId" });
    }
    
    public static final class RoguelikeGadgetInfo extends GeneratedMessageV3 implements RoguelikeGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CELL_CONFIG_ID_FIELD_NUMBER = 1;
        private int cellConfigId_;
        public static final int CELL_TYPE_FIELD_NUMBER = 2;
        private int cellType_;
        public static final int CELL_STATE_FIELD_NUMBER = 3;
        private int cellState_;
        public static final int CELL_ID_FIELD_NUMBER = 4;
        private int cellId_;
        private byte memoizedIsInitialized;
        private static final RoguelikeGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<RoguelikeGadgetInfo> PARSER;
        
        private RoguelikeGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RoguelikeGadgetInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RoguelikeGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RoguelikeGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.cellConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.cellType_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.cellState_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.cellId_ = input.readUInt32();
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
            return RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeGadgetInfo.class, Builder.class);
        }
        
        @Override
        public int getCellConfigId() {
            return this.cellConfigId_;
        }
        
        @Override
        public int getCellType() {
            return this.cellType_;
        }
        
        @Override
        public int getCellState() {
            return this.cellState_;
        }
        
        @Override
        public int getCellId() {
            return this.cellId_;
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
            if (this.cellConfigId_ != 0) {
                output.writeUInt32(1, this.cellConfigId_);
            }
            if (this.cellType_ != 0) {
                output.writeUInt32(2, this.cellType_);
            }
            if (this.cellState_ != 0) {
                output.writeUInt32(3, this.cellState_);
            }
            if (this.cellId_ != 0) {
                output.writeUInt32(4, this.cellId_);
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
            if (this.cellConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.cellConfigId_);
            }
            if (this.cellType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.cellType_);
            }
            if (this.cellState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.cellState_);
            }
            if (this.cellId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.cellId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoguelikeGadgetInfo)) {
                return super.equals(obj);
            }
            final RoguelikeGadgetInfo other = (RoguelikeGadgetInfo)obj;
            return this.getCellConfigId() == other.getCellConfigId() && this.getCellType() == other.getCellType() && this.getCellState() == other.getCellState() && this.getCellId() == other.getCellId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCellConfigId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCellType();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCellState();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getCellId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RoguelikeGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeGadgetInfo.PARSER, input);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeGadgetInfo.PARSER, input);
        }
        
        public static RoguelikeGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeGadgetInfo.PARSER, input);
        }
        
        public static RoguelikeGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RoguelikeGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RoguelikeGadgetInfo prototype) {
            return RoguelikeGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RoguelikeGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RoguelikeGadgetInfo getDefaultInstance() {
            return RoguelikeGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RoguelikeGadgetInfo> parser() {
            return RoguelikeGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<RoguelikeGadgetInfo> getParserForType() {
            return RoguelikeGadgetInfo.PARSER;
        }
        
        @Override
        public RoguelikeGadgetInfo getDefaultInstanceForType() {
            return RoguelikeGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RoguelikeGadgetInfo();
            PARSER = new AbstractParser<RoguelikeGadgetInfo>() {
                @Override
                public RoguelikeGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RoguelikeGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoguelikeGadgetInfoOrBuilder
        {
            private int cellConfigId_;
            private int cellType_;
            private int cellState_;
            private int cellId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RoguelikeGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cellConfigId_ = 0;
                this.cellType_ = 0;
                this.cellState_ = 0;
                this.cellId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RoguelikeGadgetInfoOuterClass.internal_static_RoguelikeGadgetInfo_descriptor;
            }
            
            @Override
            public RoguelikeGadgetInfo getDefaultInstanceForType() {
                return RoguelikeGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public RoguelikeGadgetInfo build() {
                final RoguelikeGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RoguelikeGadgetInfo buildPartial() {
                final RoguelikeGadgetInfo result = new RoguelikeGadgetInfo(this);
                result.cellConfigId_ = this.cellConfigId_;
                result.cellType_ = this.cellType_;
                result.cellState_ = this.cellState_;
                result.cellId_ = this.cellId_;
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
                if (other instanceof RoguelikeGadgetInfo) {
                    return this.mergeFrom((RoguelikeGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RoguelikeGadgetInfo other) {
                if (other == RoguelikeGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCellConfigId() != 0) {
                    this.setCellConfigId(other.getCellConfigId());
                }
                if (other.getCellType() != 0) {
                    this.setCellType(other.getCellType());
                }
                if (other.getCellState() != 0) {
                    this.setCellState(other.getCellState());
                }
                if (other.getCellId() != 0) {
                    this.setCellId(other.getCellId());
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
                RoguelikeGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = RoguelikeGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RoguelikeGadgetInfo)e.getUnfinishedMessage();
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
            public int getCellConfigId() {
                return this.cellConfigId_;
            }
            
            public Builder setCellConfigId(final int value) {
                this.cellConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCellConfigId() {
                this.cellConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCellType() {
                return this.cellType_;
            }
            
            public Builder setCellType(final int value) {
                this.cellType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCellType() {
                this.cellType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCellState() {
                return this.cellState_;
            }
            
            public Builder setCellState(final int value) {
                this.cellState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCellState() {
                this.cellState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCellId() {
                return this.cellId_;
            }
            
            public Builder setCellId(final int value) {
                this.cellId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCellId() {
                this.cellId_ = 0;
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
    
    public interface RoguelikeGadgetInfoOrBuilder extends MessageOrBuilder
    {
        int getCellConfigId();
        
        int getCellType();
        
        int getCellState();
        
        int getCellId();
    }
}
