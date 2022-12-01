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

public final class TowerLevelStarCondDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerLevelStarCondData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerLevelStarCondData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerLevelStarCondDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerLevelStarCondDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cTowerLevelStarCondData.proto\"t\n\u0016TowerLevelStarCondData\u0012\u001b\n\u0013Unk2700_HIFMJMAHEMB\u0018\u000f \u0001(\b\u0012\u0012\n\ncond_value\u0018\t \u0001(\r\u0012\u0010\n\bis_pause\u0018\r \u0001(\b\u0012\u0017\n\u000fstar_cond_index\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerLevelStarCondDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerLevelStarCondData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerLevelStarCondData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor, new String[] { "Unk2700HIFMJMAHEMB", "CondValue", "IsPause", "StarCondIndex" });
    }
    
    public static final class TowerLevelStarCondData extends GeneratedMessageV3 implements TowerLevelStarCondDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_HIFMJMAHEMB_FIELD_NUMBER = 15;
        private boolean unk2700HIFMJMAHEMB_;
        public static final int COND_VALUE_FIELD_NUMBER = 9;
        private int condValue_;
        public static final int IS_PAUSE_FIELD_NUMBER = 13;
        private boolean isPause_;
        public static final int STAR_COND_INDEX_FIELD_NUMBER = 6;
        private int starCondIndex_;
        private byte memoizedIsInitialized;
        private static final TowerLevelStarCondData DEFAULT_INSTANCE;
        private static final Parser<TowerLevelStarCondData> PARSER;
        
        private TowerLevelStarCondData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerLevelStarCondData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerLevelStarCondData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerLevelStarCondData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.starCondIndex_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.condValue_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isPause_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.unk2700HIFMJMAHEMB_ = input.readBool();
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
            return TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelStarCondData.class, Builder.class);
        }
        
        @Override
        public boolean getUnk2700HIFMJMAHEMB() {
            return this.unk2700HIFMJMAHEMB_;
        }
        
        @Override
        public int getCondValue() {
            return this.condValue_;
        }
        
        @Override
        public boolean getIsPause() {
            return this.isPause_;
        }
        
        @Override
        public int getStarCondIndex() {
            return this.starCondIndex_;
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
            if (this.starCondIndex_ != 0) {
                output.writeUInt32(6, this.starCondIndex_);
            }
            if (this.condValue_ != 0) {
                output.writeUInt32(9, this.condValue_);
            }
            if (this.isPause_) {
                output.writeBool(13, this.isPause_);
            }
            if (this.unk2700HIFMJMAHEMB_) {
                output.writeBool(15, this.unk2700HIFMJMAHEMB_);
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
            if (this.starCondIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.starCondIndex_);
            }
            if (this.condValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.condValue_);
            }
            if (this.isPause_) {
                size += CodedOutputStream.computeBoolSize(13, this.isPause_);
            }
            if (this.unk2700HIFMJMAHEMB_) {
                size += CodedOutputStream.computeBoolSize(15, this.unk2700HIFMJMAHEMB_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerLevelStarCondData)) {
                return super.equals(obj);
            }
            final TowerLevelStarCondData other = (TowerLevelStarCondData)obj;
            return this.getUnk2700HIFMJMAHEMB() == other.getUnk2700HIFMJMAHEMB() && this.getCondValue() == other.getCondValue() && this.getIsPause() == other.getIsPause() && this.getStarCondIndex() == other.getStarCondIndex() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700HIFMJMAHEMB());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCondValue();
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPause());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getStarCondIndex();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerLevelStarCondData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondData.PARSER, input);
        }
        
        public static TowerLevelStarCondData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondData.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelStarCondData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelStarCondData.PARSER, input);
        }
        
        public static TowerLevelStarCondData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelStarCondData.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelStarCondData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondData.PARSER, input);
        }
        
        public static TowerLevelStarCondData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerLevelStarCondData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerLevelStarCondData prototype) {
            return TowerLevelStarCondData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerLevelStarCondData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerLevelStarCondData getDefaultInstance() {
            return TowerLevelStarCondData.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerLevelStarCondData> parser() {
            return TowerLevelStarCondData.PARSER;
        }
        
        @Override
        public Parser<TowerLevelStarCondData> getParserForType() {
            return TowerLevelStarCondData.PARSER;
        }
        
        @Override
        public TowerLevelStarCondData getDefaultInstanceForType() {
            return TowerLevelStarCondData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerLevelStarCondData();
            PARSER = new AbstractParser<TowerLevelStarCondData>() {
                @Override
                public TowerLevelStarCondData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerLevelStarCondData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerLevelStarCondDataOrBuilder
        {
            private boolean unk2700HIFMJMAHEMB_;
            private int condValue_;
            private boolean isPause_;
            private int starCondIndex_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelStarCondData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerLevelStarCondData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700HIFMJMAHEMB_ = false;
                this.condValue_ = 0;
                this.isPause_ = false;
                this.starCondIndex_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
            }
            
            @Override
            public TowerLevelStarCondData getDefaultInstanceForType() {
                return TowerLevelStarCondData.getDefaultInstance();
            }
            
            @Override
            public TowerLevelStarCondData build() {
                final TowerLevelStarCondData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerLevelStarCondData buildPartial() {
                final TowerLevelStarCondData result = new TowerLevelStarCondData(this);
                result.unk2700HIFMJMAHEMB_ = this.unk2700HIFMJMAHEMB_;
                result.condValue_ = this.condValue_;
                result.isPause_ = this.isPause_;
                result.starCondIndex_ = this.starCondIndex_;
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
                if (other instanceof TowerLevelStarCondData) {
                    return this.mergeFrom((TowerLevelStarCondData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerLevelStarCondData other) {
                if (other == TowerLevelStarCondData.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700HIFMJMAHEMB()) {
                    this.setUnk2700HIFMJMAHEMB(other.getUnk2700HIFMJMAHEMB());
                }
                if (other.getCondValue() != 0) {
                    this.setCondValue(other.getCondValue());
                }
                if (other.getIsPause()) {
                    this.setIsPause(other.getIsPause());
                }
                if (other.getStarCondIndex() != 0) {
                    this.setStarCondIndex(other.getStarCondIndex());
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
                TowerLevelStarCondData parsedMessage = null;
                try {
                    parsedMessage = TowerLevelStarCondData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerLevelStarCondData)e.getUnfinishedMessage();
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
            public boolean getUnk2700HIFMJMAHEMB() {
                return this.unk2700HIFMJMAHEMB_;
            }
            
            public Builder setUnk2700HIFMJMAHEMB(final boolean value) {
                this.unk2700HIFMJMAHEMB_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HIFMJMAHEMB() {
                this.unk2700HIFMJMAHEMB_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCondValue() {
                return this.condValue_;
            }
            
            public Builder setCondValue(final int value) {
                this.condValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCondValue() {
                this.condValue_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPause() {
                return this.isPause_;
            }
            
            public Builder setIsPause(final boolean value) {
                this.isPause_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPause() {
                this.isPause_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStarCondIndex() {
                return this.starCondIndex_;
            }
            
            public Builder setStarCondIndex(final int value) {
                this.starCondIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStarCondIndex() {
                this.starCondIndex_ = 0;
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
    
    public interface TowerLevelStarCondDataOrBuilder extends MessageOrBuilder
    {
        boolean getUnk2700HIFMJMAHEMB();
        
        int getCondValue();
        
        boolean getIsPause();
        
        int getStarCondIndex();
    }
}
