// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;
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

public final class MusicGameCreateBeatmapReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameCreateBeatmapReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameCreateBeatmapReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameCreateBeatmapReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameCreateBeatmapReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fMusicGameCreateBeatmapReq.proto\u001a\u0012MusicBeatmap.proto\u001a\u0014MusicBriefInfo.proto\u001a\u001bMusicGameUnknown1Enum.proto\"¸\u0001\n\u0019MusicGameCreateBeatmapReq\u0012-\n\runknown_enum1\u0018\f \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012%\n\fmusic_record\u0018\n \u0001(\u000b2\r.MusicBeatmapH\u0000\u0012,\n\u0010music_brief_info\u0018\u00fd\u0007 \u0001(\u000b2\u000f.MusicBriefInfoH\u0001B\t\n\u0007beatmapB\f\n\nbrief_infoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameCreateBeatmapReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicBeatmapOuterClass.getDescriptor(), MusicBriefInfoOuterClass.getDescriptor(), MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameCreateBeatmapReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameCreateBeatmapReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_descriptor, new String[] { "UnknownEnum1", "MusicRecord", "MusicBriefInfo", "Beatmap", "BriefInfo" });
        MusicBeatmapOuterClass.getDescriptor();
        MusicBriefInfoOuterClass.getDescriptor();
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameCreateBeatmapReq extends GeneratedMessageV3 implements MusicGameCreateBeatmapReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int beatmapCase_;
        private Object beatmap_;
        private int briefInfoCase_;
        private Object briefInfo_;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 12;
        private int unknownEnum1_;
        public static final int MUSIC_RECORD_FIELD_NUMBER = 10;
        public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 1021;
        private byte memoizedIsInitialized;
        private static final MusicGameCreateBeatmapReq DEFAULT_INSTANCE;
        private static final Parser<MusicGameCreateBeatmapReq> PARSER;
        
        private MusicGameCreateBeatmapReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.beatmapCase_ = 0;
            this.briefInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameCreateBeatmapReq() {
            this.beatmapCase_ = 0;
            this.briefInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameCreateBeatmapReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameCreateBeatmapReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 82: {
                            MusicBeatmapOuterClass.MusicBeatmap.Builder subBuilder = null;
                            if (this.beatmapCase_ == 10) {
                                subBuilder = ((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_).toBuilder();
                            }
                            this.beatmap_ = input.readMessage(MusicBeatmapOuterClass.MusicBeatmap.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_);
                                this.beatmap_ = subBuilder.buildPartial();
                            }
                            this.beatmapCase_ = 10;
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
                            continue;
                        }
                        case 8170: {
                            MusicBriefInfoOuterClass.MusicBriefInfo.Builder subBuilder2 = null;
                            if (this.briefInfoCase_ == 1021) {
                                subBuilder2 = ((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_).toBuilder();
                            }
                            this.briefInfo_ = input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_);
                                this.briefInfo_ = subBuilder2.buildPartial();
                            }
                            this.briefInfoCase_ = 1021;
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
            return MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameCreateBeatmapReq.class, Builder.class);
        }
        
        @Override
        public BeatmapCase getBeatmapCase() {
            return BeatmapCase.forNumber(this.beatmapCase_);
        }
        
        @Override
        public BriefInfoCase getBriefInfoCase() {
            return BriefInfoCase.forNumber(this.briefInfoCase_);
        }
        
        @Override
        public int getUnknownEnum1Value() {
            return this.unknownEnum1_;
        }
        
        @Override
        public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
            final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
            return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasMusicRecord() {
            return this.beatmapCase_ == 10;
        }
        
        @Override
        public MusicBeatmapOuterClass.MusicBeatmap getMusicRecord() {
            if (this.beatmapCase_ == 10) {
                return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
            }
            return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
        }
        
        @Override
        public MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder() {
            if (this.beatmapCase_ == 10) {
                return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
            }
            return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
        }
        
        @Override
        public boolean hasMusicBriefInfo() {
            return this.briefInfoCase_ == 1021;
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
            if (this.briefInfoCase_ == 1021) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
            }
            return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
            if (this.briefInfoCase_ == 1021) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
            }
            return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
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
            if (this.beatmapCase_ == 10) {
                output.writeMessage(10, (MessageLite)this.beatmap_);
            }
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                output.writeEnum(12, this.unknownEnum1_);
            }
            if (this.briefInfoCase_ == 1021) {
                output.writeMessage(1021, (MessageLite)this.briefInfo_);
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
            if (this.beatmapCase_ == 10) {
                size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.beatmap_);
            }
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.unknownEnum1_);
            }
            if (this.briefInfoCase_ == 1021) {
                size += CodedOutputStream.computeMessageSize(1021, (MessageLite)this.briefInfo_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameCreateBeatmapReq)) {
                return super.equals(obj);
            }
            final MusicGameCreateBeatmapReq other = (MusicGameCreateBeatmapReq)obj;
            if (this.unknownEnum1_ != other.unknownEnum1_) {
                return false;
            }
            if (!this.getBeatmapCase().equals(other.getBeatmapCase())) {
                return false;
            }
            switch (this.beatmapCase_) {
                case 10: {
                    if (!this.getMusicRecord().equals(other.getMusicRecord())) {
                        return false;
                    }
                    break;
                }
            }
            if (!this.getBriefInfoCase().equals(other.getBriefInfoCase())) {
                return false;
            }
            switch (this.briefInfoCase_) {
                case 1021: {
                    if (!this.getMusicBriefInfo().equals(other.getMusicBriefInfo())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.unknownEnum1_;
            switch (this.beatmapCase_) {
                case 10: {
                    hash = 37 * hash + 10;
                    hash = 53 * hash + this.getMusicRecord().hashCode();
                    break;
                }
            }
            switch (this.briefInfoCase_) {
                case 1021: {
                    hash = 37 * hash + 1021;
                    hash = 53 * hash + this.getMusicBriefInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapReq.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameCreateBeatmapReq.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameCreateBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapReq.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameCreateBeatmapReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameCreateBeatmapReq prototype) {
            return MusicGameCreateBeatmapReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameCreateBeatmapReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameCreateBeatmapReq getDefaultInstance() {
            return MusicGameCreateBeatmapReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameCreateBeatmapReq> parser() {
            return MusicGameCreateBeatmapReq.PARSER;
        }
        
        @Override
        public Parser<MusicGameCreateBeatmapReq> getParserForType() {
            return MusicGameCreateBeatmapReq.PARSER;
        }
        
        @Override
        public MusicGameCreateBeatmapReq getDefaultInstanceForType() {
            return MusicGameCreateBeatmapReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameCreateBeatmapReq();
            PARSER = new AbstractParser<MusicGameCreateBeatmapReq>() {
                @Override
                public MusicGameCreateBeatmapReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameCreateBeatmapReq(input, extensionRegistry);
                }
            };
        }
        
        public enum BeatmapCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_RECORD(10), 
            BEATMAP_NOT_SET(0);
            
            private final int value;
            
            private BeatmapCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static BeatmapCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static BeatmapCase forNumber(final int value) {
                switch (value) {
                    case 10: {
                        return BeatmapCase.MUSIC_RECORD;
                    }
                    case 0: {
                        return BeatmapCase.BEATMAP_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ BeatmapCase[] value() {
                return new BeatmapCase[] { BeatmapCase.MUSIC_RECORD, BeatmapCase.BEATMAP_NOT_SET };
            }
            
            
        }
        
        public enum BriefInfoCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_BRIEF_INFO(1021), 
            BRIEFINFO_NOT_SET(0);
            
            private final int value;
            
            private BriefInfoCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static BriefInfoCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static BriefInfoCase forNumber(final int value) {
                switch (value) {
                    case 1021: {
                        return BriefInfoCase.MUSIC_BRIEF_INFO;
                    }
                    case 0: {
                        return BriefInfoCase.BRIEFINFO_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ BriefInfoCase[] value() {
                return new BriefInfoCase[] { BriefInfoCase.MUSIC_BRIEF_INFO, BriefInfoCase.BRIEFINFO_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameCreateBeatmapReqOrBuilder
        {
            private int beatmapCase_;
            private Object beatmap_;
            private int briefInfoCase_;
            private Object briefInfo_;
            private int unknownEnum1_;
            private SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder> musicRecordBuilder_;
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameCreateBeatmapReq.class, Builder.class);
            }
            
            private Builder() {
                this.beatmapCase_ = 0;
                this.briefInfoCase_ = 0;
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.beatmapCase_ = 0;
                this.briefInfoCase_ = 0;
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameCreateBeatmapReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unknownEnum1_ = 0;
                this.beatmapCase_ = 0;
                this.beatmap_ = null;
                this.briefInfoCase_ = 0;
                this.briefInfo_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameCreateBeatmapReqOuterClass.internal_static_MusicGameCreateBeatmapReq_descriptor;
            }
            
            @Override
            public MusicGameCreateBeatmapReq getDefaultInstanceForType() {
                return MusicGameCreateBeatmapReq.getDefaultInstance();
            }
            
            @Override
            public MusicGameCreateBeatmapReq build() {
                final MusicGameCreateBeatmapReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameCreateBeatmapReq buildPartial() {
                final MusicGameCreateBeatmapReq result = new MusicGameCreateBeatmapReq(this);
                result.unknownEnum1_ = this.unknownEnum1_;
                if (this.beatmapCase_ == 10) {
                    if (this.musicRecordBuilder_ == null) {
                        result.beatmap_ = this.beatmap_;
                    }
                    else {
                        result.beatmap_ = this.musicRecordBuilder_.build();
                    }
                }
                if (this.briefInfoCase_ == 1021) {
                    if (this.musicBriefInfoBuilder_ == null) {
                        result.briefInfo_ = this.briefInfo_;
                    }
                    else {
                        result.briefInfo_ = this.musicBriefInfoBuilder_.build();
                    }
                }
                result.beatmapCase_ = this.beatmapCase_;
                result.briefInfoCase_ = this.briefInfoCase_;
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
                if (other instanceof MusicGameCreateBeatmapReq) {
                    return this.mergeFrom((MusicGameCreateBeatmapReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameCreateBeatmapReq other) {
                if (other == MusicGameCreateBeatmapReq.getDefaultInstance()) {
                    return this;
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
                }
                switch (other.getBeatmapCase()) {
                    case MUSIC_RECORD: {
                        this.mergeMusicRecord(other.getMusicRecord());
                        break;
                    }
                }
                switch (other.getBriefInfoCase()) {
                    case MUSIC_BRIEF_INFO: {
                        this.mergeMusicBriefInfo(other.getMusicBriefInfo());
                        break;
                    }
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
                MusicGameCreateBeatmapReq parsedMessage = null;
                try {
                    parsedMessage = MusicGameCreateBeatmapReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameCreateBeatmapReq)e.getUnfinishedMessage();
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
            public BeatmapCase getBeatmapCase() {
                return BeatmapCase.forNumber(this.beatmapCase_);
            }
            
            public Builder clearBeatmap() {
                this.beatmapCase_ = 0;
                this.beatmap_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public BriefInfoCase getBriefInfoCase() {
                return BriefInfoCase.forNumber(this.briefInfoCase_);
            }
            
            public Builder clearBriefInfo() {
                this.briefInfoCase_ = 0;
                this.briefInfo_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnknownEnum1Value() {
                return this.unknownEnum1_;
            }
            
            public Builder setUnknownEnum1Value(final int value) {
                this.unknownEnum1_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
                final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
                return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
            }
            
            public Builder setUnknownEnum1(final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unknownEnum1_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnknownEnum1() {
                this.unknownEnum1_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMusicRecord() {
                return this.beatmapCase_ == 10;
            }
            
            @Override
            public MusicBeatmapOuterClass.MusicBeatmap getMusicRecord() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 10) {
                        return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
                    }
                    return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                }
                else {
                    if (this.beatmapCase_ == 10) {
                        return this.musicRecordBuilder_.getMessage();
                    }
                    return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                }
            }
            
            public Builder setMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap value) {
                if (this.musicRecordBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.beatmap_ = value;
                    this.onChanged();
                }
                else {
                    this.musicRecordBuilder_.setMessage(value);
                }
                this.beatmapCase_ = 10;
                return this;
            }
            
            public Builder setMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap.Builder builderForValue) {
                if (this.musicRecordBuilder_ == null) {
                    this.beatmap_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicRecordBuilder_.setMessage(builderForValue.build());
                }
                this.beatmapCase_ = 10;
                return this;
            }
            
            public Builder mergeMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap value) {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 10 && this.beatmap_ != MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance()) {
                        this.beatmap_ = MusicBeatmapOuterClass.MusicBeatmap.newBuilder((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.beatmap_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.beatmapCase_ == 10) {
                        this.musicRecordBuilder_.mergeFrom(value);
                    }
                    this.musicRecordBuilder_.setMessage(value);
                }
                this.beatmapCase_ = 10;
                return this;
            }
            
            public Builder clearMusicRecord() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 10) {
                        this.beatmapCase_ = 0;
                        this.beatmap_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.beatmapCase_ == 10) {
                        this.beatmapCase_ = 0;
                        this.beatmap_ = null;
                    }
                    this.musicRecordBuilder_.clear();
                }
                return this;
            }
            
            public MusicBeatmapOuterClass.MusicBeatmap.Builder getMusicRecordBuilder() {
                return this.getMusicRecordFieldBuilder().getBuilder();
            }
            
            @Override
            public MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder() {
                if (this.beatmapCase_ == 10 && this.musicRecordBuilder_ != null) {
                    return this.musicRecordBuilder_.getMessageOrBuilder();
                }
                if (this.beatmapCase_ == 10) {
                    return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
                }
                return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder> getMusicRecordFieldBuilder() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ != 10) {
                        this.beatmap_ = MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                    }
                    this.musicRecordBuilder_ = new SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder>((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_, this.getParentForChildren(), this.isClean());
                    this.beatmap_ = null;
                }
                this.beatmapCase_ = 10;
                this.onChanged();
                return this.musicRecordBuilder_;
            }
            
            @Override
            public boolean hasMusicBriefInfo() {
                return this.briefInfoCase_ == 1021;
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 1021) {
                        return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
                    }
                    return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                }
                else {
                    if (this.briefInfoCase_ == 1021) {
                        return this.musicBriefInfoBuilder_.getMessage();
                    }
                    return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                }
            }
            
            public Builder setMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.briefInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.briefInfoCase_ = 1021;
                return this;
            }
            
            public Builder setMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.musicBriefInfoBuilder_ == null) {
                    this.briefInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(builderForValue.build());
                }
                this.briefInfoCase_ = 1021;
                return this;
            }
            
            public Builder mergeMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 1021 && this.briefInfo_ != MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance()) {
                        this.briefInfo_ = MusicBriefInfoOuterClass.MusicBriefInfo.newBuilder((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.briefInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.briefInfoCase_ == 1021) {
                        this.musicBriefInfoBuilder_.mergeFrom(value);
                    }
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.briefInfoCase_ = 1021;
                return this;
            }
            
            public Builder clearMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 1021) {
                        this.briefInfoCase_ = 0;
                        this.briefInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.briefInfoCase_ == 1021) {
                        this.briefInfoCase_ = 0;
                        this.briefInfo_ = null;
                    }
                    this.musicBriefInfoBuilder_.clear();
                }
                return this;
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder getMusicBriefInfoBuilder() {
                return this.getMusicBriefInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
                if (this.briefInfoCase_ == 1021 && this.musicBriefInfoBuilder_ != null) {
                    return this.musicBriefInfoBuilder_.getMessageOrBuilder();
                }
                if (this.briefInfoCase_ == 1021) {
                    return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
                }
                return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getMusicBriefInfoFieldBuilder() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ != 1021) {
                        this.briefInfo_ = MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                    }
                    this.musicBriefInfoBuilder_ = new SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_, this.getParentForChildren(), this.isClean());
                    this.briefInfo_ = null;
                }
                this.briefInfoCase_ = 1021;
                this.onChanged();
                return this.musicBriefInfoBuilder_;
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
    
    public interface MusicGameCreateBeatmapReqOrBuilder extends MessageOrBuilder
    {
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        boolean hasMusicRecord();
        
        MusicBeatmapOuterClass.MusicBeatmap getMusicRecord();
        
        MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder();
        
        boolean hasMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();
        
        MusicGameCreateBeatmapReq.BeatmapCase getBeatmapCase();
        
        MusicGameCreateBeatmapReq.BriefInfoCase getBriefInfoCase();
    }
}
