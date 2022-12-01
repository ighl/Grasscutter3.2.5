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

public final class MusicGameRecordOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameRecord_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameRecord_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameRecordOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameRecordOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015MusicGameRecord.proto\"J\n\u000fMusicGameRecord\u0012\u0011\n\tis_unlock\u0018\t \u0001(\b\u0012\u0011\n\tmax_score\u0018\u000b \u0001(\r\u0012\u0011\n\tmax_combo\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameRecordOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicGameRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor, new String[] { "IsUnlock", "MaxScore", "MaxCombo" });
    }
    
    public static final class MusicGameRecord extends GeneratedMessageV3 implements MusicGameRecordOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_UNLOCK_FIELD_NUMBER = 9;
        private boolean isUnlock_;
        public static final int MAX_SCORE_FIELD_NUMBER = 11;
        private int maxScore_;
        public static final int MAX_COMBO_FIELD_NUMBER = 6;
        private int maxCombo_;
        private byte memoizedIsInitialized;
        private static final MusicGameRecord DEFAULT_INSTANCE;
        private static final Parser<MusicGameRecord> PARSER;
        
        private MusicGameRecord(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameRecord() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameRecord();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameRecord(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.maxCombo_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.isUnlock_ = input.readBool();
                            continue;
                        }
                        case 88: {
                            this.maxScore_ = input.readUInt32();
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
            return MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameRecordOuterClass.internal_static_MusicGameRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameRecord.class, Builder.class);
        }
        
        @Override
        public boolean getIsUnlock() {
            return this.isUnlock_;
        }
        
        @Override
        public int getMaxScore() {
            return this.maxScore_;
        }
        
        @Override
        public int getMaxCombo() {
            return this.maxCombo_;
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
            if (this.maxCombo_ != 0) {
                output.writeUInt32(6, this.maxCombo_);
            }
            if (this.isUnlock_) {
                output.writeBool(9, this.isUnlock_);
            }
            if (this.maxScore_ != 0) {
                output.writeUInt32(11, this.maxScore_);
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
            if (this.maxCombo_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.maxCombo_);
            }
            if (this.isUnlock_) {
                size += CodedOutputStream.computeBoolSize(9, this.isUnlock_);
            }
            if (this.maxScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.maxScore_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameRecord)) {
                return super.equals(obj);
            }
            final MusicGameRecord other = (MusicGameRecord)obj;
            return this.getIsUnlock() == other.getIsUnlock() && this.getMaxScore() == other.getMaxScore() && this.getMaxCombo() == other.getMaxCombo() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsUnlock());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMaxScore();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getMaxCombo();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameRecord parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data);
        }
        
        public static MusicGameRecord parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameRecord parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data);
        }
        
        public static MusicGameRecord parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameRecord parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data);
        }
        
        public static MusicGameRecord parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameRecord parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameRecord.PARSER, input);
        }
        
        public static MusicGameRecord parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameRecord.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameRecord parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameRecord.PARSER, input);
        }
        
        public static MusicGameRecord parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameRecord.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameRecord parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameRecord.PARSER, input);
        }
        
        public static MusicGameRecord parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameRecord.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameRecord.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameRecord prototype) {
            return MusicGameRecord.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameRecord.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameRecord getDefaultInstance() {
            return MusicGameRecord.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameRecord> parser() {
            return MusicGameRecord.PARSER;
        }
        
        @Override
        public Parser<MusicGameRecord> getParserForType() {
            return MusicGameRecord.PARSER;
        }
        
        @Override
        public MusicGameRecord getDefaultInstanceForType() {
            return MusicGameRecord.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameRecord();
            PARSER = new AbstractParser<MusicGameRecord>() {
                @Override
                public MusicGameRecord parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameRecord(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameRecordOrBuilder
        {
            private boolean isUnlock_;
            private int maxScore_;
            private int maxCombo_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameRecordOuterClass.internal_static_MusicGameRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameRecord.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameRecord.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isUnlock_ = false;
                this.maxScore_ = 0;
                this.maxCombo_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
            }
            
            @Override
            public MusicGameRecord getDefaultInstanceForType() {
                return MusicGameRecord.getDefaultInstance();
            }
            
            @Override
            public MusicGameRecord build() {
                final MusicGameRecord result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameRecord buildPartial() {
                final MusicGameRecord result = new MusicGameRecord(this);
                result.isUnlock_ = this.isUnlock_;
                result.maxScore_ = this.maxScore_;
                result.maxCombo_ = this.maxCombo_;
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
                if (other instanceof MusicGameRecord) {
                    return this.mergeFrom((MusicGameRecord)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameRecord other) {
                if (other == MusicGameRecord.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsUnlock()) {
                    this.setIsUnlock(other.getIsUnlock());
                }
                if (other.getMaxScore() != 0) {
                    this.setMaxScore(other.getMaxScore());
                }
                if (other.getMaxCombo() != 0) {
                    this.setMaxCombo(other.getMaxCombo());
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
                MusicGameRecord parsedMessage = null;
                try {
                    parsedMessage = MusicGameRecord.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameRecord)e.getUnfinishedMessage();
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
            public boolean getIsUnlock() {
                return this.isUnlock_;
            }
            
            public Builder setIsUnlock(final boolean value) {
                this.isUnlock_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsUnlock() {
                this.isUnlock_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxScore() {
                return this.maxScore_;
            }
            
            public Builder setMaxScore(final int value) {
                this.maxScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxScore() {
                this.maxScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxCombo() {
                return this.maxCombo_;
            }
            
            public Builder setMaxCombo(final int value) {
                this.maxCombo_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxCombo() {
                this.maxCombo_ = 0;
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
    
    public interface MusicGameRecordOrBuilder extends MessageOrBuilder
    {
        boolean getIsUnlock();
        
        int getMaxScore();
        
        int getMaxCombo();
    }
}
